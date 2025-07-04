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
 * GetPluginBindingRequest
 */



public class GetPluginBindingRequest {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("PluginName")
  private String pluginName = null;

  @SerializedName("Scope")
  private String scope = null;

  @SerializedName("Target")
  private String target = null;

  public GetPluginBindingRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetPluginBindingRequest pluginName(String pluginName) {
    this.pluginName = pluginName;
    return this;
  }

   /**
   * Get pluginName
   * @return pluginName
  **/
  @Schema(description = "")
  public String getPluginName() {
    return pluginName;
  }

  public void setPluginName(String pluginName) {
    this.pluginName = pluginName;
  }

  public GetPluginBindingRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public GetPluginBindingRequest target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Schema(description = "")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPluginBindingRequest getPluginBindingRequest = (GetPluginBindingRequest) o;
    return Objects.equals(this.id, getPluginBindingRequest.id) &&
        Objects.equals(this.pluginName, getPluginBindingRequest.pluginName) &&
        Objects.equals(this.scope, getPluginBindingRequest.scope) &&
        Objects.equals(this.target, getPluginBindingRequest.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pluginName, scope, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPluginBindingRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
