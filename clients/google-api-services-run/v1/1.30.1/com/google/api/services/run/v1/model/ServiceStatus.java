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

package com.google.api.services.run.v1.model;

/**
 * The current state of the Service. Output only.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceStatus extends com.google.api.client.json.GenericJson {

  /**
   * From RouteStatus. Similar to url, information on where the service is available on HTTP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Addressable address;

  /**
   * Conditions communicates information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world. Service-specific conditions include: *
   * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true
   * when the underlying Route is ready. * "Ready": true when both the underlying Route and
   * Configuration are ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV1Condition> conditions;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV1Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV1Condition.class);
  }

  /**
   * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from
   * this Service's Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestCreatedRevisionName;

  /**
   * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped
   * out from this Service's Configuration that has had its "Ready" condition become "True".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestReadyRevisionName;

  /**
   * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always
   * contain RevisionName references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrafficTarget> traffic;

  /**
   * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic
   * targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-
   * suffix}.a.run.app
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * From RouteStatus. Similar to url, information on where the service is available on HTTP.
   * @return value or {@code null} for none
   */
  public Addressable getAddress() {
    return address;
  }

  /**
   * From RouteStatus. Similar to url, information on where the service is available on HTTP.
   * @param address address or {@code null} for none
   */
  public ServiceStatus setAddress(Addressable address) {
    this.address = address;
    return this;
  }

  /**
   * Conditions communicates information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world. Service-specific conditions include: *
   * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true
   * when the underlying Route is ready. * "Ready": true when both the underlying Route and
   * Configuration are ready.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV1Condition> getConditions() {
    return conditions;
  }

  /**
   * Conditions communicates information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world. Service-specific conditions include: *
   * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true
   * when the underlying Route is ready. * "Ready": true when both the underlying Route and
   * Configuration are ready.
   * @param conditions conditions or {@code null} for none
   */
  public ServiceStatus setConditions(java.util.List<GoogleCloudRunV1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from
   * this Service's Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestCreatedRevisionName() {
    return latestCreatedRevisionName;
  }

  /**
   * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from
   * this Service's Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
   * @param latestCreatedRevisionName latestCreatedRevisionName or {@code null} for none
   */
  public ServiceStatus setLatestCreatedRevisionName(java.lang.String latestCreatedRevisionName) {
    this.latestCreatedRevisionName = latestCreatedRevisionName;
    return this;
  }

  /**
   * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped
   * out from this Service's Configuration that has had its "Ready" condition become "True".
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestReadyRevisionName() {
    return latestReadyRevisionName;
  }

  /**
   * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped
   * out from this Service's Configuration that has had its "Ready" condition become "True".
   * @param latestReadyRevisionName latestReadyRevisionName or {@code null} for none
   */
  public ServiceStatus setLatestReadyRevisionName(java.lang.String latestReadyRevisionName) {
    this.latestReadyRevisionName = latestReadyRevisionName;
    return this;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public ServiceStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always
   * contain RevisionName references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * @return value or {@code null} for none
   */
  public java.util.List<TrafficTarget> getTraffic() {
    return traffic;
  }

  /**
   * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always
   * contain RevisionName references. When ConfigurationName appears in the spec, this will hold the
   * LatestReadyRevisionName that we last observed.
   * @param traffic traffic or {@code null} for none
   */
  public ServiceStatus setTraffic(java.util.List<TrafficTarget> traffic) {
    this.traffic = traffic;
    return this;
  }

  /**
   * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic
   * targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-
   * suffix}.a.run.app
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic
   * targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-
   * suffix}.a.run.app
   * @param url url or {@code null} for none
   */
  public ServiceStatus setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ServiceStatus set(String fieldName, Object value) {
    return (ServiceStatus) super.set(fieldName, value);
  }

  @Override
  public ServiceStatus clone() {
    return (ServiceStatus) super.clone();
  }

}
