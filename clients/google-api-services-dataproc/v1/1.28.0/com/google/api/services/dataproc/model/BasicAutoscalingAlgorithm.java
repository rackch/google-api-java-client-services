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

package com.google.api.services.dataproc.model;

/**
 * Basic algorithm for autoscaling.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicAutoscalingAlgorithm extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Duration between scaling events. A scaling period starts after the update operation
   * from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cooldownPeriod;

  /**
   * Required. YARN autoscaling configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicYarnAutoscalingConfig yarnConfig;

  /**
   * Optional. Duration between scaling events. A scaling period starts after the update operation
   * from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
   * @return value or {@code null} for none
   */
  public String getCooldownPeriod() {
    return cooldownPeriod;
  }

  /**
   * Optional. Duration between scaling events. A scaling period starts after the update operation
   * from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
   * @param cooldownPeriod cooldownPeriod or {@code null} for none
   */
  public BasicAutoscalingAlgorithm setCooldownPeriod(String cooldownPeriod) {
    this.cooldownPeriod = cooldownPeriod;
    return this;
  }

  /**
   * Required. YARN autoscaling configuration.
   * @return value or {@code null} for none
   */
  public BasicYarnAutoscalingConfig getYarnConfig() {
    return yarnConfig;
  }

  /**
   * Required. YARN autoscaling configuration.
   * @param yarnConfig yarnConfig or {@code null} for none
   */
  public BasicAutoscalingAlgorithm setYarnConfig(BasicYarnAutoscalingConfig yarnConfig) {
    this.yarnConfig = yarnConfig;
    return this;
  }

  @Override
  public BasicAutoscalingAlgorithm set(String fieldName, Object value) {
    return (BasicAutoscalingAlgorithm) super.set(fieldName, value);
  }

  @Override
  public BasicAutoscalingAlgorithm clone() {
    return (BasicAutoscalingAlgorithm) super.clone();
  }

}