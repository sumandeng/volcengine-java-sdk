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
import com.volcengine.aiotvideo.model.TTLForGetRecordPlanOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TemplateInfoForGetRecordPlanOutput
 */



public class TemplateInfoForGetRecordPlanOutput {
  @SerializedName("Format")
  private String format = null;

  @SerializedName("TTL")
  private TTLForGetRecordPlanOutput TTL = null;

  public TemplateInfoForGetRecordPlanOutput format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public TemplateInfoForGetRecordPlanOutput TTL(TTLForGetRecordPlanOutput TTL) {
    this.TTL = TTL;
    return this;
  }

   /**
   * Get TTL
   * @return TTL
  **/
  @Valid
  @Schema(description = "")
  public TTLForGetRecordPlanOutput getTTL() {
    return TTL;
  }

  public void setTTL(TTLForGetRecordPlanOutput TTL) {
    this.TTL = TTL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateInfoForGetRecordPlanOutput templateInfoForGetRecordPlanOutput = (TemplateInfoForGetRecordPlanOutput) o;
    return Objects.equals(this.format, templateInfoForGetRecordPlanOutput.format) &&
        Objects.equals(this.TTL, templateInfoForGetRecordPlanOutput.TTL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, TTL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateInfoForGetRecordPlanOutput {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    TTL: ").append(toIndentedString(TTL)).append("\n");
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
