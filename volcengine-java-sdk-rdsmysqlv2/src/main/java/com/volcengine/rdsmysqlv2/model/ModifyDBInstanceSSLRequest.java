/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * ModifyDBInstanceSSLRequest
 */



public class ModifyDBInstanceSSLRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ReloadSSLCertificate")
  private Boolean reloadSSLCertificate = null;

  @SerializedName("SSLEnable")
  private Boolean ssLEnable = null;

  @SerializedName("SpecifiedSwitchEndTime")
  private String specifiedSwitchEndTime = null;

  @SerializedName("SpecifiedSwitchStartTime")
  private String specifiedSwitchStartTime = null;

  @SerializedName("SwitchType")
  private String switchType = null;

  public ModifyDBInstanceSSLRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBInstanceSSLRequest reloadSSLCertificate(Boolean reloadSSLCertificate) {
    this.reloadSSLCertificate = reloadSSLCertificate;
    return this;
  }

   /**
   * Get reloadSSLCertificate
   * @return reloadSSLCertificate
  **/
  @Schema(description = "")
  public Boolean isReloadSSLCertificate() {
    return reloadSSLCertificate;
  }

  public void setReloadSSLCertificate(Boolean reloadSSLCertificate) {
    this.reloadSSLCertificate = reloadSSLCertificate;
  }

  public ModifyDBInstanceSSLRequest ssLEnable(Boolean ssLEnable) {
    this.ssLEnable = ssLEnable;
    return this;
  }

   /**
   * Get ssLEnable
   * @return ssLEnable
  **/
  @Schema(description = "")
  public Boolean isSsLEnable() {
    return ssLEnable;
  }

  public void setSsLEnable(Boolean ssLEnable) {
    this.ssLEnable = ssLEnable;
  }

  public ModifyDBInstanceSSLRequest specifiedSwitchEndTime(String specifiedSwitchEndTime) {
    this.specifiedSwitchEndTime = specifiedSwitchEndTime;
    return this;
  }

   /**
   * Get specifiedSwitchEndTime
   * @return specifiedSwitchEndTime
  **/
  @Schema(description = "")
  public String getSpecifiedSwitchEndTime() {
    return specifiedSwitchEndTime;
  }

  public void setSpecifiedSwitchEndTime(String specifiedSwitchEndTime) {
    this.specifiedSwitchEndTime = specifiedSwitchEndTime;
  }

  public ModifyDBInstanceSSLRequest specifiedSwitchStartTime(String specifiedSwitchStartTime) {
    this.specifiedSwitchStartTime = specifiedSwitchStartTime;
    return this;
  }

   /**
   * Get specifiedSwitchStartTime
   * @return specifiedSwitchStartTime
  **/
  @Schema(description = "")
  public String getSpecifiedSwitchStartTime() {
    return specifiedSwitchStartTime;
  }

  public void setSpecifiedSwitchStartTime(String specifiedSwitchStartTime) {
    this.specifiedSwitchStartTime = specifiedSwitchStartTime;
  }

  public ModifyDBInstanceSSLRequest switchType(String switchType) {
    this.switchType = switchType;
    return this;
  }

   /**
   * Get switchType
   * @return switchType
  **/
  @Schema(description = "")
  public String getSwitchType() {
    return switchType;
  }

  public void setSwitchType(String switchType) {
    this.switchType = switchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceSSLRequest modifyDBInstanceSSLRequest = (ModifyDBInstanceSSLRequest) o;
    return Objects.equals(this.instanceId, modifyDBInstanceSSLRequest.instanceId) &&
        Objects.equals(this.reloadSSLCertificate, modifyDBInstanceSSLRequest.reloadSSLCertificate) &&
        Objects.equals(this.ssLEnable, modifyDBInstanceSSLRequest.ssLEnable) &&
        Objects.equals(this.specifiedSwitchEndTime, modifyDBInstanceSSLRequest.specifiedSwitchEndTime) &&
        Objects.equals(this.specifiedSwitchStartTime, modifyDBInstanceSSLRequest.specifiedSwitchStartTime) &&
        Objects.equals(this.switchType, modifyDBInstanceSSLRequest.switchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, reloadSSLCertificate, ssLEnable, specifiedSwitchEndTime, specifiedSwitchStartTime, switchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceSSLRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    reloadSSLCertificate: ").append(toIndentedString(reloadSSLCertificate)).append("\n");
    sb.append("    ssLEnable: ").append(toIndentedString(ssLEnable)).append("\n");
    sb.append("    specifiedSwitchEndTime: ").append(toIndentedString(specifiedSwitchEndTime)).append("\n");
    sb.append("    specifiedSwitchStartTime: ").append(toIndentedString(specifiedSwitchStartTime)).append("\n");
    sb.append("    switchType: ").append(toIndentedString(switchType)).append("\n");
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
