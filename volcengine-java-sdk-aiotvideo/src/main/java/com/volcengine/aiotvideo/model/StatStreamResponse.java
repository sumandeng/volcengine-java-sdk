/*
 * aiotvideo
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.aiotvideo.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.aiotvideo.model.SessionDataForStatStreamOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatStreamResponse
 */



public class StatStreamResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("SessionData")
  private SessionDataForStatStreamOutput sessionData = null;

  public StatStreamResponse sessionData(SessionDataForStatStreamOutput sessionData) {
    this.sessionData = sessionData;
    return this;
  }

   /**
   * Get sessionData
   * @return sessionData
  **/
  @Valid
  @Schema(description = "")
  public SessionDataForStatStreamOutput getSessionData() {
    return sessionData;
  }

  public void setSessionData(SessionDataForStatStreamOutput sessionData) {
    this.sessionData = sessionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatStreamResponse statStreamResponse = (StatStreamResponse) o;
    return Objects.equals(this.sessionData, statStreamResponse.sessionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatStreamResponse {\n");
    
    sb.append("    sessionData: ").append(toIndentedString(sessionData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
