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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * The desired output location and metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1OutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The max number of response protos to put into each output JSON file on Google Cloud Storage.
   * The valid range is [1, 100]. If not specified, the default value is 20. For example, for one
   * pdf file with 100 pages, 100 response protos will be generated. If `batch_size` = 20, then 5
   * json files each containing 20 response protos will be written under the prefix
   * `gcs_destination`.`uri`. Currently, batch_size only applies to GcsDestination, with potential
   * future support for other output configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer batchSize;

  /**
   * The Google Cloud Storage location to write the output(s) to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1GcsDestination gcsDestination;

  /**
   * The max number of response protos to put into each output JSON file on Google Cloud Storage.
   * The valid range is [1, 100]. If not specified, the default value is 20. For example, for one
   * pdf file with 100 pages, 100 response protos will be generated. If `batch_size` = 20, then 5
   * json files each containing 20 response protos will be written under the prefix
   * `gcs_destination`.`uri`. Currently, batch_size only applies to GcsDestination, with potential
   * future support for other output configurations.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBatchSize() {
    return batchSize;
  }

  /**
   * The max number of response protos to put into each output JSON file on Google Cloud Storage.
   * The valid range is [1, 100]. If not specified, the default value is 20. For example, for one
   * pdf file with 100 pages, 100 response protos will be generated. If `batch_size` = 20, then 5
   * json files each containing 20 response protos will be written under the prefix
   * `gcs_destination`.`uri`. Currently, batch_size only applies to GcsDestination, with potential
   * future support for other output configurations.
   * @param batchSize batchSize or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1OutputConfig setBatchSize(java.lang.Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * The Google Cloud Storage location to write the output(s) to.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1GcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * The Google Cloud Storage location to write the output(s) to.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1OutputConfig setGcsDestination(GoogleCloudVisionV1p2beta1GcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1OutputConfig set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1OutputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1OutputConfig clone() {
    return (GoogleCloudVisionV1p2beta1OutputConfig) super.clone();
  }

}
