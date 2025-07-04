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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AlertNotificationForCreateDeviceInput
 */



public class AlertNotificationForCreateDeviceInput {
  @SerializedName("Device")
  private Boolean device = null;

  @SerializedName("DeviceFault")
  private Boolean deviceFault = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("GPS")
  private Boolean GPS = null;

  @SerializedName("Other")
  private Boolean other = null;

  @SerializedName("Phone")
  private Boolean phone = null;

  @SerializedName("SMS")
  private Boolean SMS = null;

  @SerializedName("Video")
  private Boolean video = null;

  public AlertNotificationForCreateDeviceInput device(Boolean device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @Schema(description = "")
  public Boolean isDevice() {
    return device;
  }

  public void setDevice(Boolean device) {
    this.device = device;
  }

  public AlertNotificationForCreateDeviceInput deviceFault(Boolean deviceFault) {
    this.deviceFault = deviceFault;
    return this;
  }

   /**
   * Get deviceFault
   * @return deviceFault
  **/
  @Schema(description = "")
  public Boolean isDeviceFault() {
    return deviceFault;
  }

  public void setDeviceFault(Boolean deviceFault) {
    this.deviceFault = deviceFault;
  }

  public AlertNotificationForCreateDeviceInput enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AlertNotificationForCreateDeviceInput GPS(Boolean GPS) {
    this.GPS = GPS;
    return this;
  }

   /**
   * Get GPS
   * @return GPS
  **/
  @Schema(description = "")
  public Boolean isGPS() {
    return GPS;
  }

  public void setGPS(Boolean GPS) {
    this.GPS = GPS;
  }

  public AlertNotificationForCreateDeviceInput other(Boolean other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @Schema(description = "")
  public Boolean isOther() {
    return other;
  }

  public void setOther(Boolean other) {
    this.other = other;
  }

  public AlertNotificationForCreateDeviceInput phone(Boolean phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public Boolean isPhone() {
    return phone;
  }

  public void setPhone(Boolean phone) {
    this.phone = phone;
  }

  public AlertNotificationForCreateDeviceInput SMS(Boolean SMS) {
    this.SMS = SMS;
    return this;
  }

   /**
   * Get SMS
   * @return SMS
  **/
  @Schema(description = "")
  public Boolean isSMS() {
    return SMS;
  }

  public void setSMS(Boolean SMS) {
    this.SMS = SMS;
  }

  public AlertNotificationForCreateDeviceInput video(Boolean video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @Schema(description = "")
  public Boolean isVideo() {
    return video;
  }

  public void setVideo(Boolean video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotificationForCreateDeviceInput alertNotificationForCreateDeviceInput = (AlertNotificationForCreateDeviceInput) o;
    return Objects.equals(this.device, alertNotificationForCreateDeviceInput.device) &&
        Objects.equals(this.deviceFault, alertNotificationForCreateDeviceInput.deviceFault) &&
        Objects.equals(this.enabled, alertNotificationForCreateDeviceInput.enabled) &&
        Objects.equals(this.GPS, alertNotificationForCreateDeviceInput.GPS) &&
        Objects.equals(this.other, alertNotificationForCreateDeviceInput.other) &&
        Objects.equals(this.phone, alertNotificationForCreateDeviceInput.phone) &&
        Objects.equals(this.SMS, alertNotificationForCreateDeviceInput.SMS) &&
        Objects.equals(this.video, alertNotificationForCreateDeviceInput.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, deviceFault, enabled, GPS, other, phone, SMS, video);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotificationForCreateDeviceInput {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceFault: ").append(toIndentedString(deviceFault)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    GPS: ").append(toIndentedString(GPS)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    SMS: ").append(toIndentedString(SMS)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
