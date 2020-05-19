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

package com.google.api.services.verifiedaccess.v1.model;

/**
 * Result message for VerifiedAccess.CreateChallenge.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Verified Access API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Challenge extends com.google.api.client.json.GenericJson {

  /**
   * Challenge generated with the old signing key (this will only be present during key rotation)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SignedData alternativeChallenge;

  /**
   * Generated challenge
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SignedData challenge;

  /**
   * Challenge generated with the old signing key (this will only be present during key rotation)
   * @return value or {@code null} for none
   */
  public SignedData getAlternativeChallenge() {
    return alternativeChallenge;
  }

  /**
   * Challenge generated with the old signing key (this will only be present during key rotation)
   * @param alternativeChallenge alternativeChallenge or {@code null} for none
   */
  public Challenge setAlternativeChallenge(SignedData alternativeChallenge) {
    this.alternativeChallenge = alternativeChallenge;
    return this;
  }

  /**
   * Generated challenge
   * @return value or {@code null} for none
   */
  public SignedData getChallenge() {
    return challenge;
  }

  /**
   * Generated challenge
   * @param challenge challenge or {@code null} for none
   */
  public Challenge setChallenge(SignedData challenge) {
    this.challenge = challenge;
    return this;
  }

  @Override
  public Challenge set(String fieldName, Object value) {
    return (Challenge) super.set(fieldName, value);
  }

  @Override
  public Challenge clone() {
    return (Challenge) super.clone();
  }

}
