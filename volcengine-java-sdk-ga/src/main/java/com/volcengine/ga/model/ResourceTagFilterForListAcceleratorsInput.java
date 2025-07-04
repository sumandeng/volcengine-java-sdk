/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ga.model.ResourceTagForListAcceleratorsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ResourceTagFilterForListAcceleratorsInput
 */



public class ResourceTagFilterForListAcceleratorsInput {
  @SerializedName("FilterType")
  private String filterType = null;

  @SerializedName("ResourceTags")
  private List<ResourceTagForListAcceleratorsInput> resourceTags = null;

  public ResourceTagFilterForListAcceleratorsInput filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Get filterType
   * @return filterType
  **/
  @Schema(description = "")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public ResourceTagFilterForListAcceleratorsInput resourceTags(List<ResourceTagForListAcceleratorsInput> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public ResourceTagFilterForListAcceleratorsInput addResourceTagsItem(ResourceTagForListAcceleratorsInput resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<ResourceTagForListAcceleratorsInput>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceTagForListAcceleratorsInput> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<ResourceTagForListAcceleratorsInput> resourceTags) {
    this.resourceTags = resourceTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTagFilterForListAcceleratorsInput resourceTagFilterForListAcceleratorsInput = (ResourceTagFilterForListAcceleratorsInput) o;
    return Objects.equals(this.filterType, resourceTagFilterForListAcceleratorsInput.filterType) &&
        Objects.equals(this.resourceTags, resourceTagFilterForListAcceleratorsInput.resourceTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, resourceTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTagFilterForListAcceleratorsInput {\n");
    
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
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
