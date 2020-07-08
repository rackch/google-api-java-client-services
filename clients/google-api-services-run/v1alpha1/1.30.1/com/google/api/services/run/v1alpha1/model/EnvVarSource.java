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

package com.google.api.services.run.v1alpha1.model;

/**
 * Cloud Run fully managed: not supported
 *
 * Cloud Run on GKE: supported
 *
 * EnvVarSource represents a source for the value of an EnvVar.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnvVarSource extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run on GKE: supported
   *
   * Selects a key of a ConfigMap. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigMapKeySelector configMapKeyRef;

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run on GKE: supported
   *
   * Selects a key of a secret in the pod's namespace +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecretKeySelector secretKeyRef;

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run on GKE: supported
   *
   * Selects a key of a ConfigMap. +optional
   * @return value or {@code null} for none
   */
  public ConfigMapKeySelector getConfigMapKeyRef() {
    return configMapKeyRef;
  }

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run on GKE: supported
   *
   * Selects a key of a ConfigMap. +optional
   * @param configMapKeyRef configMapKeyRef or {@code null} for none
   */
  public EnvVarSource setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run on GKE: supported
   *
   * Selects a key of a secret in the pod's namespace +optional
   * @return value or {@code null} for none
   */
  public SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }

  /**
   * Cloud Run fully managed: not supported
   *
   * Cloud Run on GKE: supported
   *
   * Selects a key of a secret in the pod's namespace +optional
   * @param secretKeyRef secretKeyRef or {@code null} for none
   */
  public EnvVarSource setSecretKeyRef(SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }

  @Override
  public EnvVarSource set(String fieldName, Object value) {
    return (EnvVarSource) super.set(fieldName, value);
  }

  @Override
  public EnvVarSource clone() {
    return (EnvVarSource) super.clone();
  }

}
