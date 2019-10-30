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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * Version preview configuration. If active and unexpired, this version will be accessible via a
 * custom URL even if it is not the currently released version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PreviewConfig extends com.google.api.client.json.GenericJson {

  /**
   * If true, preview URLs are enabled for this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean active;

  /**
   * Indicates the expiration time for previewing this version; preview URL requests received after
   * this time will 404.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * If true, preview URLs are enabled for this version.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * If true, preview URLs are enabled for this version.
   * @param active active or {@code null} for none
   */
  public PreviewConfig setActive(java.lang.Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Indicates the expiration time for previewing this version; preview URL requests received after
   * this time will 404.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Indicates the expiration time for previewing this version; preview URL requests received after
   * this time will 404.
   * @param expireTime expireTime or {@code null} for none
   */
  public PreviewConfig setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  @Override
  public PreviewConfig set(String fieldName, Object value) {
    return (PreviewConfig) super.set(fieldName, value);
  }

  @Override
  public PreviewConfig clone() {
    return (PreviewConfig) super.clone();
  }

}
