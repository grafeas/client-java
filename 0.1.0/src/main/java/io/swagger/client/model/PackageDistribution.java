/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PackageArchitecture;
import io.swagger.client.model.PackageVersion;
import java.io.IOException;

/**
 * This represents a particular channel of distribution for a given package. E.g., Debian&#39;s jessie-backports dpkg mirror.
 */
@ApiModel(description = "This represents a particular channel of distribution for a given package. E.g., Debian's jessie-backports dpkg mirror.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class PackageDistribution {
  @SerializedName("cpe_uri")
  private String cpeUri = null;

  @SerializedName("architecture")
  private PackageArchitecture architecture = null;

  @SerializedName("latest_version")
  private PackageVersion latestVersion = null;

  @SerializedName("maintainer")
  private String maintainer = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("description")
  private String description = null;

  public PackageDistribution cpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

   /**
   * Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
   * @return cpeUri
  **/
  @ApiModelProperty(value = "Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.")
  public String getCpeUri() {
    return cpeUri;
  }

  public void setCpeUri(String cpeUri) {
    this.cpeUri = cpeUri;
  }

  public PackageDistribution architecture(PackageArchitecture architecture) {
    this.architecture = architecture;
    return this;
  }

   /**
   * The CPU architecture for which packages in this distribution channel were built.
   * @return architecture
  **/
  @ApiModelProperty(value = "The CPU architecture for which packages in this distribution channel were built.")
  public PackageArchitecture getArchitecture() {
    return architecture;
  }

  public void setArchitecture(PackageArchitecture architecture) {
    this.architecture = architecture;
  }

  public PackageDistribution latestVersion(PackageVersion latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

   /**
   * The latest available version of this package in this distribution channel.
   * @return latestVersion
  **/
  @ApiModelProperty(value = "The latest available version of this package in this distribution channel.")
  public PackageVersion getLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(PackageVersion latestVersion) {
    this.latestVersion = latestVersion;
  }

  public PackageDistribution maintainer(String maintainer) {
    this.maintainer = maintainer;
    return this;
  }

   /**
   * A freeform string denoting the maintainer of this package.
   * @return maintainer
  **/
  @ApiModelProperty(value = "A freeform string denoting the maintainer of this package.")
  public String getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }

  public PackageDistribution url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The distribution channel-specific homepage for this package.
   * @return url
  **/
  @ApiModelProperty(value = "The distribution channel-specific homepage for this package.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PackageDistribution description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The distribution channel-specific description of this package.
   * @return description
  **/
  @ApiModelProperty(value = "The distribution channel-specific description of this package.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDistribution packageDistribution = (PackageDistribution) o;
    return Objects.equals(this.cpeUri, packageDistribution.cpeUri) &&
        Objects.equals(this.architecture, packageDistribution.architecture) &&
        Objects.equals(this.latestVersion, packageDistribution.latestVersion) &&
        Objects.equals(this.maintainer, packageDistribution.maintainer) &&
        Objects.equals(this.url, packageDistribution.url) &&
        Objects.equals(this.description, packageDistribution.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpeUri, architecture, latestVersion, maintainer, url, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDistribution {\n");
    
    sb.append("    cpeUri: ").append(toIndentedString(cpeUri)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
