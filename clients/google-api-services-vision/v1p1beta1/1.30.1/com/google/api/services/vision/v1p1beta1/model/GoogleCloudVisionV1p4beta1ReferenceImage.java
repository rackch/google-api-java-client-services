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
 * A `ReferenceImage` represents a product image and its associated metadata, such as bounding
 * boxes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p4beta1ReferenceImage extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Bounding polygons around the areas of interest in the reference image. If this field
   * is empty, the system will try to detect regions of interest. At most 10 bounding polygons will
   * be used. The provided shape is converted into a non-rotated rectangle. Once converted, the
   * small edge of the rectangle must be greater than or equal to 300 pixels. The aspect ratio must
   * be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p4beta1BoundingPoly> boundingPolys;

  static {
    // hack to force ProGuard to consider GoogleCloudVisionV1p4beta1BoundingPoly used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVisionV1p4beta1BoundingPoly.class);
  }

  /**
   * The resource name of the reference image. Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. This field
   * is ignored when creating a reference image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The Google Cloud Storage URI of the reference image. The URI must start with `gs://`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Optional. Bounding polygons around the areas of interest in the reference image. If this field
   * is empty, the system will try to detect regions of interest. At most 10 bounding polygons will
   * be used. The provided shape is converted into a non-rotated rectangle. Once converted, the
   * small edge of the rectangle must be greater than or equal to 300 pixels. The aspect ratio must
   * be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p4beta1BoundingPoly> getBoundingPolys() {
    return boundingPolys;
  }

  /**
   * Optional. Bounding polygons around the areas of interest in the reference image. If this field
   * is empty, the system will try to detect regions of interest. At most 10 bounding polygons will
   * be used. The provided shape is converted into a non-rotated rectangle. Once converted, the
   * small edge of the rectangle must be greater than or equal to 300 pixels. The aspect ratio must
   * be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
   * @param boundingPolys boundingPolys or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1ReferenceImage setBoundingPolys(java.util.List<GoogleCloudVisionV1p4beta1BoundingPoly> boundingPolys) {
    this.boundingPolys = boundingPolys;
    return this;
  }

  /**
   * The resource name of the reference image. Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. This field
   * is ignored when creating a reference image.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the reference image. Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. This field
   * is ignored when creating a reference image.
   * @param name name or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1ReferenceImage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The Google Cloud Storage URI of the reference image. The URI must start with `gs://`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The Google Cloud Storage URI of the reference image. The URI must start with `gs://`.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1ReferenceImage setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p4beta1ReferenceImage set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p4beta1ReferenceImage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p4beta1ReferenceImage clone() {
    return (GoogleCloudVisionV1p4beta1ReferenceImage) super.clone();
  }

}
