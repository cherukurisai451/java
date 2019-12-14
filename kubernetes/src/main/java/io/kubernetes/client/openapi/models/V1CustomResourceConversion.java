/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1WebhookConversion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@ApiModel(description = "CustomResourceConversion describes how to convert different versions of a CR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class V1CustomResourceConversion {
  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private V1WebhookConversion webhook;


  public V1CustomResourceConversion strategy(String strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the custom resource. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.")

  public String getStrategy() {
    return strategy;
  }


  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  public V1CustomResourceConversion webhook(V1WebhookConversion webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1WebhookConversion getWebhook() {
    return webhook;
  }


  public void setWebhook(V1WebhookConversion webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceConversion v1CustomResourceConversion = (V1CustomResourceConversion) o;
    return Objects.equals(this.strategy, v1CustomResourceConversion.strategy) &&
        Objects.equals(this.webhook, v1CustomResourceConversion.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceConversion {\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
