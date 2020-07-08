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
 * Cloud Run fully managed: not supported
 *
 * Cloud Run on GKE: supported
 *
 * Namespace provides a scope for Names. Use of multiple namespaces is optional.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Namespace extends com.google.api.client.json.GenericJson {

  /**
   * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-
   * conventions.md#metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectMeta metadata;

  /**
   * Spec defines the behavior of the Namespace. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamespaceSpec spec;

  /**
   * Status describes the current status of a Namespace. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamespaceStatus status;

  /**
   * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-
   * conventions.md#metadata
   * @return value or {@code null} for none
   */
  public ObjectMeta getMetadata() {
    return metadata;
  }

  /**
   * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-
   * conventions.md#metadata
   * @param metadata metadata or {@code null} for none
   */
  public Namespace setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Spec defines the behavior of the Namespace. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * @return value or {@code null} for none
   */
  public NamespaceSpec getSpec() {
    return spec;
  }

  /**
   * Spec defines the behavior of the Namespace. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * @param spec spec or {@code null} for none
   */
  public Namespace setSpec(NamespaceSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Status describes the current status of a Namespace. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * @return value or {@code null} for none
   */
  public NamespaceStatus getStatus() {
    return status;
  }

  /**
   * Status describes the current status of a Namespace. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * @param status status or {@code null} for none
   */
  public Namespace setStatus(NamespaceStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public Namespace set(String fieldName, Object value) {
    return (Namespace) super.set(fieldName, value);
  }

  @Override
  public Namespace clone() {
    return (Namespace) super.clone();
  }

}
