/*
 * dbw
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dbw.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dbw.model.DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAuditLogDetailResponse
 */



public class DescribeAuditLogDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DescribeAuditLogDetailRows")
  private List<DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput> describeAuditLogDetailRows = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeAuditLogDetailResponse describeAuditLogDetailRows(List<DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput> describeAuditLogDetailRows) {
    this.describeAuditLogDetailRows = describeAuditLogDetailRows;
    return this;
  }

  public DescribeAuditLogDetailResponse addDescribeAuditLogDetailRowsItem(DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput describeAuditLogDetailRowsItem) {
    if (this.describeAuditLogDetailRows == null) {
      this.describeAuditLogDetailRows = new ArrayList<DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput>();
    }
    this.describeAuditLogDetailRows.add(describeAuditLogDetailRowsItem);
    return this;
  }

   /**
   * Get describeAuditLogDetailRows
   * @return describeAuditLogDetailRows
  **/
  @Valid
  @Schema(description = "")
  public List<DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput> getDescribeAuditLogDetailRows() {
    return describeAuditLogDetailRows;
  }

  public void setDescribeAuditLogDetailRows(List<DescribeAuditLogDetailRowForDescribeAuditLogDetailOutput> describeAuditLogDetailRows) {
    this.describeAuditLogDetailRows = describeAuditLogDetailRows;
  }

  public DescribeAuditLogDetailResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeAuditLogDetailResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAuditLogDetailResponse describeAuditLogDetailResponse = (DescribeAuditLogDetailResponse) o;
    return Objects.equals(this.describeAuditLogDetailRows, describeAuditLogDetailResponse.describeAuditLogDetailRows) &&
        Objects.equals(this.nextToken, describeAuditLogDetailResponse.nextToken) &&
        Objects.equals(this.totalCount, describeAuditLogDetailResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describeAuditLogDetailRows, nextToken, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAuditLogDetailResponse {\n");
    
    sb.append("    describeAuditLogDetailRows: ").append(toIndentedString(describeAuditLogDetailRows)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
