/*
 * apig
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HmacAuthCredentialForListConsumerCredentialsOutput
 */



public class HmacAuthCredentialForListConsumerCredentialsOutput {
  @SerializedName("AccessKey")
  private String accessKey = null;

  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("SecretKey")
  private String secretKey = null;

  public HmacAuthCredentialForListConsumerCredentialsOutput accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public HmacAuthCredentialForListConsumerCredentialsOutput enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public HmacAuthCredentialForListConsumerCredentialsOutput secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HmacAuthCredentialForListConsumerCredentialsOutput hmacAuthCredentialForListConsumerCredentialsOutput = (HmacAuthCredentialForListConsumerCredentialsOutput) o;
    return Objects.equals(this.accessKey, hmacAuthCredentialForListConsumerCredentialsOutput.accessKey) &&
        Objects.equals(this.enable, hmacAuthCredentialForListConsumerCredentialsOutput.enable) &&
        Objects.equals(this.secretKey, hmacAuthCredentialForListConsumerCredentialsOutput.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, enable, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HmacAuthCredentialForListConsumerCredentialsOutput {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
