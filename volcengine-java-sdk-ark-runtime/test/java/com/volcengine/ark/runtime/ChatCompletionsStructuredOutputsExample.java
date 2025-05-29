package com.volcengine.ark.runtime;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest.ChatCompletionRequestResponseFormat;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessageRole;
import com.volcengine.ark.runtime.model.completion.chat.ResponseFormatJSONSchemaJSONSchemaParam;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
# pom.xml
<dependency>
  <groupId>com.volcengine</groupId>
  <artifactId>volcengine-java-sdk-ark-runtime</artifactId>
  <version>LATEST</version>
</dependency>
*/

public class ChatCompletionsStructuredOutputsExample {

    /**
     * Authentication
     * 1.If you authorize your endpoint using an API key, you can set your api key to environment variable "ARK_API_KEY"
     * String apiKey = System.getenv("ARK_API_KEY");
     * ArkService service = new ArkService(apiKey);
     * Note: If you use an API key, this API key will not be refreshed.
     * To prevent the API from expiring and failing after some time, choose an API key with no expiration date.
     * <p>
     * 2.If you authorize your endpoint with Volcengine Identity and Access Management（IAM), set your api key to environment variable "VOLC_ACCESSKEY", "VOLC_SECRETKEY"
     * String ak = System.getenv("VOLC_ACCESSKEY");
     * String sk = System.getenv("VOLC_SECRETKEY");
     * ArkService service = new ArkService(ak, sk);
     * To get your ak&sk, please refer to this document(https://www.volcengine.com/docs/6291/65568)
     * For more information，please check this document（https://www.volcengine.com/docs/82379/1263279）
     */

    static String apiKey = System.getenv("ARK_API_KEY");
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static ArkService service = ArkService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("\n----- standard request -----");
        final List<ChatMessage> messages = new ArrayList<>();
        final ChatMessage userMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("How many Rs are there in the word 'strawberry'?").build();
        messages.add(userMessage);
        String jsonStr = "{\"key\": \"value\"}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode schemaNode = mapper.readTree(jsonStr);
        final ChatCompletionRequestResponseFormat responseFormat = new ChatCompletionRequestResponseFormat("json_schema",
                new ResponseFormatJSONSchemaJSONSchemaParam("biography", "Notable information about a person", schemaNode, true));

        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .messages(messages)
                .responseFormat(responseFormat)
                .build();

        service.createChatCompletion(chatCompletionRequest).getChoices().forEach(
                choice -> {
                    System.out.println(choice.getMessage().getReasoningContent());
                    System.out.println(choice.getMessage().getContent());
                }
        );

        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

}
