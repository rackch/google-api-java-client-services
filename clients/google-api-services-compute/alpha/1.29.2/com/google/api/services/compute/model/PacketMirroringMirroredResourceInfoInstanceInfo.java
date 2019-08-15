/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Model definition for PacketMirroringMirroredResourceInfoInstanceInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PacketMirroringMirroredResourceInfoInstanceInfo extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Unique identifier for the instance; defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalUrl;

  /**
   * Resource URL to the virtual machine instance which is being mirrored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * [Output Only] Unique identifier for the instance; defined by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalUrl() {
    return canonicalUrl;
  }

  /**
   * [Output Only] Unique identifier for the instance; defined by the server.
   * @param canonicalUrl canonicalUrl or {@code null} for none
   */
  public PacketMirroringMirroredResourceInfoInstanceInfo setCanonicalUrl(java.lang.String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
    return this;
  }

  /**
   * Resource URL to the virtual machine instance which is being mirrored.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Resource URL to the virtual machine instance which is being mirrored.
   * @param url url or {@code null} for none
   */
  public PacketMirroringMirroredResourceInfoInstanceInfo setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public PacketMirroringMirroredResourceInfoInstanceInfo set(String fieldName, Object value) {
    return (PacketMirroringMirroredResourceInfoInstanceInfo) super.set(fieldName, value);
  }

  @Override
  public PacketMirroringMirroredResourceInfoInstanceInfo clone() {
    return (PacketMirroringMirroredResourceInfoInstanceInfo) super.clone();
  }

}