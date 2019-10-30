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
 * A `Version` is the collection of configuration and [static files](sites.versions.files) that
 * determine how a site is displayed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Version extends com.google.api.client.json.GenericJson {

  /**
   * The configuration for the behavior of the site. This configuration exists in the
   * [`firebase.json`](/docs/cli/#the_firebasejson_file) file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServingConfig config;

  /**
   * Output only. The time at which the version was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Identifies the user who created the version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActingUser createUser;

  /**
   * Output only. The time at which the version was `DELETED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Output only. Identifies the user who `DELETED` the version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActingUser deleteUser;

  /**
   * Output only. The total number of files associated with the version. This value is calculated
   * after a version is `FINALIZED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fileCount;

  /**
   * Output only. The time at which the version was `FINALIZED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String finalizeTime;

  /**
   * Output only. Identifies the user who `FINALIZED` the version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActingUser finalizeUser;

  /**
   * The labels used for extra metadata and/or filtering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The unique identifier for a version, in the format: sites/site-name/versions/versionID This
   * name is provided in the response body when you call the
   * [`CreateVersion`](../sites.versions/create) endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Version preview configuration for the site version. This configuration specfies whether
   * previewing is enabled for this site version. Version previews allow you to preview your site at
   * a custom URL before releasing it as the live version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreviewConfig preview;

  /**
   * The deploy status of a version.
   *
   * For a successful deploy, call the [`CreateVersion`](sites.versions/create) endpoint to make a
   * new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the
   * version, then [update](sites.versions/patch) the version to the `FINALIZED` status.
   *
   * Note that if you leave the version in the `CREATED` state for more than 12hours, the system
   * will automatically mark the version as `ABANDONED`.
   *
   * You can also change the status of a version to `DELETED` by calling the
   * [`DeleteVersion`](sites.versions/delete) endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. The total stored bytesize of the version. This value is calculated after a version
   * is `FINALIZED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionBytes;

  /**
   * The configuration for the behavior of the site. This configuration exists in the
   * [`firebase.json`](/docs/cli/#the_firebasejson_file) file.
   * @return value or {@code null} for none
   */
  public ServingConfig getConfig() {
    return config;
  }

  /**
   * The configuration for the behavior of the site. This configuration exists in the
   * [`firebase.json`](/docs/cli/#the_firebasejson_file) file.
   * @param config config or {@code null} for none
   */
  public Version setConfig(ServingConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. The time at which the version was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the version was created.
   * @param createTime createTime or {@code null} for none
   */
  public Version setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Identifies the user who created the version.
   * @return value or {@code null} for none
   */
  public ActingUser getCreateUser() {
    return createUser;
  }

  /**
   * Output only. Identifies the user who created the version.
   * @param createUser createUser or {@code null} for none
   */
  public Version setCreateUser(ActingUser createUser) {
    this.createUser = createUser;
    return this;
  }

  /**
   * Output only. The time at which the version was `DELETED`.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The time at which the version was `DELETED`.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Version setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Output only. Identifies the user who `DELETED` the version.
   * @return value or {@code null} for none
   */
  public ActingUser getDeleteUser() {
    return deleteUser;
  }

  /**
   * Output only. Identifies the user who `DELETED` the version.
   * @param deleteUser deleteUser or {@code null} for none
   */
  public Version setDeleteUser(ActingUser deleteUser) {
    this.deleteUser = deleteUser;
    return this;
  }

  /**
   * Output only. The total number of files associated with the version. This value is calculated
   * after a version is `FINALIZED`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFileCount() {
    return fileCount;
  }

  /**
   * Output only. The total number of files associated with the version. This value is calculated
   * after a version is `FINALIZED`.
   * @param fileCount fileCount or {@code null} for none
   */
  public Version setFileCount(java.lang.Long fileCount) {
    this.fileCount = fileCount;
    return this;
  }

  /**
   * Output only. The time at which the version was `FINALIZED`.
   * @return value or {@code null} for none
   */
  public String getFinalizeTime() {
    return finalizeTime;
  }

  /**
   * Output only. The time at which the version was `FINALIZED`.
   * @param finalizeTime finalizeTime or {@code null} for none
   */
  public Version setFinalizeTime(String finalizeTime) {
    this.finalizeTime = finalizeTime;
    return this;
  }

  /**
   * Output only. Identifies the user who `FINALIZED` the version.
   * @return value or {@code null} for none
   */
  public ActingUser getFinalizeUser() {
    return finalizeUser;
  }

  /**
   * Output only. Identifies the user who `FINALIZED` the version.
   * @param finalizeUser finalizeUser or {@code null} for none
   */
  public Version setFinalizeUser(ActingUser finalizeUser) {
    this.finalizeUser = finalizeUser;
    return this;
  }

  /**
   * The labels used for extra metadata and/or filtering.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels used for extra metadata and/or filtering.
   * @param labels labels or {@code null} for none
   */
  public Version setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The unique identifier for a version, in the format: sites/site-name/versions/versionID This
   * name is provided in the response body when you call the
   * [`CreateVersion`](../sites.versions/create) endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier for a version, in the format: sites/site-name/versions/versionID This
   * name is provided in the response body when you call the
   * [`CreateVersion`](../sites.versions/create) endpoint.
   * @param name name or {@code null} for none
   */
  public Version setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Version preview configuration for the site version. This configuration specfies whether
   * previewing is enabled for this site version. Version previews allow you to preview your site at
   * a custom URL before releasing it as the live version.
   * @return value or {@code null} for none
   */
  public PreviewConfig getPreview() {
    return preview;
  }

  /**
   * Version preview configuration for the site version. This configuration specfies whether
   * previewing is enabled for this site version. Version previews allow you to preview your site at
   * a custom URL before releasing it as the live version.
   * @param preview preview or {@code null} for none
   */
  public Version setPreview(PreviewConfig preview) {
    this.preview = preview;
    return this;
  }

  /**
   * The deploy status of a version.
   *
   * For a successful deploy, call the [`CreateVersion`](sites.versions/create) endpoint to make a
   * new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the
   * version, then [update](sites.versions/patch) the version to the `FINALIZED` status.
   *
   * Note that if you leave the version in the `CREATED` state for more than 12hours, the system
   * will automatically mark the version as `ABANDONED`.
   *
   * You can also change the status of a version to `DELETED` by calling the
   * [`DeleteVersion`](sites.versions/delete) endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The deploy status of a version.
   *
   * For a successful deploy, call the [`CreateVersion`](sites.versions/create) endpoint to make a
   * new version (`CREATED` status), [upload all desired files](sites.versions/populateFiles) to the
   * version, then [update](sites.versions/patch) the version to the `FINALIZED` status.
   *
   * Note that if you leave the version in the `CREATED` state for more than 12hours, the system
   * will automatically mark the version as `ABANDONED`.
   *
   * You can also change the status of a version to `DELETED` by calling the
   * [`DeleteVersion`](sites.versions/delete) endpoint.
   * @param status status or {@code null} for none
   */
  public Version setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. The total stored bytesize of the version. This value is calculated after a version
   * is `FINALIZED`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionBytes() {
    return versionBytes;
  }

  /**
   * Output only. The total stored bytesize of the version. This value is calculated after a version
   * is `FINALIZED`.
   * @param versionBytes versionBytes or {@code null} for none
   */
  public Version setVersionBytes(java.lang.Long versionBytes) {
    this.versionBytes = versionBytes;
    return this;
  }

  @Override
  public Version set(String fieldName, Object value) {
    return (Version) super.set(fieldName, value);
  }

  @Override
  public Version clone() {
    return (Version) super.clone();
  }

}
