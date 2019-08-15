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
 * Model definition for InstancesRemoveResourcePoliciesRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesRemoveResourcePoliciesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Resource policies to be removed from this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourcePolicies;

  /**
   * Resource policies to be removed from this instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourcePolicies() {
    return resourcePolicies;
  }

  /**
   * Resource policies to be removed from this instance.
   * @param resourcePolicies resourcePolicies or {@code null} for none
   */
  public InstancesRemoveResourcePoliciesRequest setResourcePolicies(java.util.List<java.lang.String> resourcePolicies) {
    this.resourcePolicies = resourcePolicies;
    return this;
  }

  @Override
  public InstancesRemoveResourcePoliciesRequest set(String fieldName, Object value) {
    return (InstancesRemoveResourcePoliciesRequest) super.set(fieldName, value);
  }

  @Override
  public InstancesRemoveResourcePoliciesRequest clone() {
    return (InstancesRemoveResourcePoliciesRequest) super.clone();
  }

}