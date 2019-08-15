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
 * Represents a Firewall Rule resource.
 *
 * Firewall rules allow or deny ingress traffic to, and egress traffic from your instances. For more
 * information, read Firewall rules.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Firewall extends com.google.api.client.json.GenericJson {

  /**
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-
   * range tuple that describes a permitted connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Allowed> allowed;

  static {
    // hack to force ProGuard to consider Allowed used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Allowed.class);
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-
   * range tuple that describes a denied connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Denied> denied;

  static {
    // hack to force ProGuard to consider Denied used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Denied.class);
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * If destination ranges are specified, the firewall rule applies only to traffic that has
   * destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   * IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destinationRanges;

  /**
   * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default
   * is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for
   * `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not
   * enforced and the network behaves as if it did not exist. If this is unspecified, the firewall
   * rule will be enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a
   * particular firewall rule. If logging is enabled, logs will be exported to Stackdriver.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableLogging;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#firewall for firewall rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * This field denotes the logging options for a particular firewall rule. If logging is enabled,
   * logs will be exported to Stackdriver.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FirewallLogConfig logConfig;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * URL of the network resource for this firewall rule. If not specified when creating a firewall
   * rule, the default network is used: global/networks/default If you choose to specify this field,
   * you can specify the network as a full or partial URL. For example, the following are all valid
   * URLs:   - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
   * - projects/myproject/global/networks/my-network  - global/networks/default
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default
   * value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply.
   * Lower values indicate higher priority. For example, a rule with priority `0` has higher
   * precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they
   * have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To
   * avoid conflicts with the implied rules, use a priority number less than `65535`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP
   * address in these ranges. These ranges must be expressed in CIDR format. One or both of
   * sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic
   * that has a source IP address within sourceRanges OR a source IP from a resource with a matching
   * tag listed in the sourceTags field. The connection does not need to match both fields for the
   * rule to apply. Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceRanges;

  /**
   * If source service accounts are specified, the firewall rules apply only to traffic originating
   * from an instance with a service account in this list. Source service accounts cannot be used to
   * control traffic to an instance's external IP address because service accounts are associated
   * with an instance, not an IP address. sourceRanges can be set at the same time as
   * sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP
   * address within the sourceRanges OR a source IP that belongs to an instance with service account
   * listed in sourceServiceAccount. The connection does not need to match both fields for the
   * firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or
   * targetTags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceServiceAccounts;

  /**
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that
   * match the primary network interfaces of VM instances that have the tag and are in the same VPC
   * network. Source tags cannot be used to control traffic to an instance's external IP address, it
   * only applies to traffic between instances in the same virtual network. Because tags are
   * associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be
   * set. If both fields are set, the firewall applies to traffic that has a source IP address
   * within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags
   * field. The connection does not need to match both fields for the firewall to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceTags;

  /**
   * A list of service accounts indicating sets of instances located in the network that may make
   * network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same
   * time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   * specified, the firewall rule applies to all instances on the specified network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetServiceAccounts;

  /**
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are
   * specified, then the firewall rule applies only to instances in the VPC network that have one of
   * those tags. If no targetTags are specified, the firewall rule applies to all instances on the
   * specified network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetTags;

  /**
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-
   * range tuple that describes a permitted connection.
   * @return value or {@code null} for none
   */
  public java.util.List<Allowed> getAllowed() {
    return allowed;
  }

  /**
   * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-
   * range tuple that describes a permitted connection.
   * @param allowed allowed or {@code null} for none
   */
  public Firewall setAllowed(java.util.List<Allowed> allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Firewall setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-
   * range tuple that describes a denied connection.
   * @return value or {@code null} for none
   */
  public java.util.List<Denied> getDenied() {
    return denied;
  }

  /**
   * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-
   * range tuple that describes a denied connection.
   * @param denied denied or {@code null} for none
   */
  public Firewall setDenied(java.util.List<Denied> denied) {
    this.denied = denied;
    return this;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @param description description or {@code null} for none
   */
  public Firewall setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * If destination ranges are specified, the firewall rule applies only to traffic that has
   * destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   * IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestinationRanges() {
    return destinationRanges;
  }

  /**
   * If destination ranges are specified, the firewall rule applies only to traffic that has
   * destination IP address in these ranges. These ranges must be expressed in CIDR format. Only
   * IPv4 is supported.
   * @param destinationRanges destinationRanges or {@code null} for none
   */
  public Firewall setDestinationRanges(java.util.List<java.lang.String> destinationRanges) {
    this.destinationRanges = destinationRanges;
    return this;
  }

  /**
   * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default
   * is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for
   * `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default
   * is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for
   * `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
   * @param direction direction or {@code null} for none
   */
  public Firewall setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not
   * enforced and the network behaves as if it did not exist. If this is unspecified, the firewall
   * rule will be enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not
   * enforced and the network behaves as if it did not exist. If this is unspecified, the firewall
   * rule will be enabled.
   * @param disabled disabled or {@code null} for none
   */
  public Firewall setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a
   * particular firewall rule. If logging is enabled, logs will be exported to Stackdriver.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableLogging() {
    return enableLogging;
  }

  /**
   * Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a
   * particular firewall rule. If logging is enabled, logs will be exported to Stackdriver.
   * @param enableLogging enableLogging or {@code null} for none
   */
  public Firewall setEnableLogging(java.lang.Boolean enableLogging) {
    this.enableLogging = enableLogging;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Firewall setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#firewall for firewall rules.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#firewall for firewall rules.
   * @param kind kind or {@code null} for none
   */
  public Firewall setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * This field denotes the logging options for a particular firewall rule. If logging is enabled,
   * logs will be exported to Stackdriver.
   * @return value or {@code null} for none
   */
  public FirewallLogConfig getLogConfig() {
    return logConfig;
  }

  /**
   * This field denotes the logging options for a particular firewall rule. If logging is enabled,
   * logs will be exported to Stackdriver.
   * @param logConfig logConfig or {@code null} for none
   */
  public Firewall setLogConfig(FirewallLogConfig logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @param name name or {@code null} for none
   */
  public Firewall setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * URL of the network resource for this firewall rule. If not specified when creating a firewall
   * rule, the default network is used: global/networks/default If you choose to specify this field,
   * you can specify the network as a full or partial URL. For example, the following are all valid
   * URLs:   - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
   * - projects/myproject/global/networks/my-network  - global/networks/default
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * URL of the network resource for this firewall rule. If not specified when creating a firewall
   * rule, the default network is used: global/networks/default If you choose to specify this field,
   * you can specify the network as a full or partial URL. For example, the following are all valid
   * URLs:   - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
   * - projects/myproject/global/networks/my-network  - global/networks/default
   * @param network network or {@code null} for none
   */
  public Firewall setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default
   * value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply.
   * Lower values indicate higher priority. For example, a rule with priority `0` has higher
   * precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they
   * have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To
   * avoid conflicts with the implied rules, use a priority number less than `65535`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default
   * value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply.
   * Lower values indicate higher priority. For example, a rule with priority `0` has higher
   * precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they
   * have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To
   * avoid conflicts with the implied rules, use a priority number less than `65535`.
   * @param priority priority or {@code null} for none
   */
  public Firewall setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Firewall setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public Firewall setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP
   * address in these ranges. These ranges must be expressed in CIDR format. One or both of
   * sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic
   * that has a source IP address within sourceRanges OR a source IP from a resource with a matching
   * tag listed in the sourceTags field. The connection does not need to match both fields for the
   * rule to apply. Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceRanges() {
    return sourceRanges;
  }

  /**
   * If source ranges are specified, the firewall rule applies only to traffic that has a source IP
   * address in these ranges. These ranges must be expressed in CIDR format. One or both of
   * sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic
   * that has a source IP address within sourceRanges OR a source IP from a resource with a matching
   * tag listed in the sourceTags field. The connection does not need to match both fields for the
   * rule to apply. Only IPv4 is supported.
   * @param sourceRanges sourceRanges or {@code null} for none
   */
  public Firewall setSourceRanges(java.util.List<java.lang.String> sourceRanges) {
    this.sourceRanges = sourceRanges;
    return this;
  }

  /**
   * If source service accounts are specified, the firewall rules apply only to traffic originating
   * from an instance with a service account in this list. Source service accounts cannot be used to
   * control traffic to an instance's external IP address because service accounts are associated
   * with an instance, not an IP address. sourceRanges can be set at the same time as
   * sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP
   * address within the sourceRanges OR a source IP that belongs to an instance with service account
   * listed in sourceServiceAccount. The connection does not need to match both fields for the
   * firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or
   * targetTags.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceServiceAccounts() {
    return sourceServiceAccounts;
  }

  /**
   * If source service accounts are specified, the firewall rules apply only to traffic originating
   * from an instance with a service account in this list. Source service accounts cannot be used to
   * control traffic to an instance's external IP address because service accounts are associated
   * with an instance, not an IP address. sourceRanges can be set at the same time as
   * sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP
   * address within the sourceRanges OR a source IP that belongs to an instance with service account
   * listed in sourceServiceAccount. The connection does not need to match both fields for the
   * firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or
   * targetTags.
   * @param sourceServiceAccounts sourceServiceAccounts or {@code null} for none
   */
  public Firewall setSourceServiceAccounts(java.util.List<java.lang.String> sourceServiceAccounts) {
    this.sourceServiceAccounts = sourceServiceAccounts;
    return this;
  }

  /**
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that
   * match the primary network interfaces of VM instances that have the tag and are in the same VPC
   * network. Source tags cannot be used to control traffic to an instance's external IP address, it
   * only applies to traffic between instances in the same virtual network. Because tags are
   * associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be
   * set. If both fields are set, the firewall applies to traffic that has a source IP address
   * within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags
   * field. The connection does not need to match both fields for the firewall to apply.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceTags() {
    return sourceTags;
  }

  /**
   * If source tags are specified, the firewall rule applies only to traffic with source IPs that
   * match the primary network interfaces of VM instances that have the tag and are in the same VPC
   * network. Source tags cannot be used to control traffic to an instance's external IP address, it
   * only applies to traffic between instances in the same virtual network. Because tags are
   * associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be
   * set. If both fields are set, the firewall applies to traffic that has a source IP address
   * within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags
   * field. The connection does not need to match both fields for the firewall to apply.
   * @param sourceTags sourceTags or {@code null} for none
   */
  public Firewall setSourceTags(java.util.List<java.lang.String> sourceTags) {
    this.sourceTags = sourceTags;
    return this;
  }

  /**
   * A list of service accounts indicating sets of instances located in the network that may make
   * network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same
   * time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   * specified, the firewall rule applies to all instances on the specified network.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetServiceAccounts() {
    return targetServiceAccounts;
  }

  /**
   * A list of service accounts indicating sets of instances located in the network that may make
   * network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same
   * time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are
   * specified, the firewall rule applies to all instances on the specified network.
   * @param targetServiceAccounts targetServiceAccounts or {@code null} for none
   */
  public Firewall setTargetServiceAccounts(java.util.List<java.lang.String> targetServiceAccounts) {
    this.targetServiceAccounts = targetServiceAccounts;
    return this;
  }

  /**
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are
   * specified, then the firewall rule applies only to instances in the VPC network that have one of
   * those tags. If no targetTags are specified, the firewall rule applies to all instances on the
   * specified network.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetTags() {
    return targetTags;
  }

  /**
   * A list of tags that controls which instances the firewall rule applies to. If targetTags are
   * specified, then the firewall rule applies only to instances in the VPC network that have one of
   * those tags. If no targetTags are specified, the firewall rule applies to all instances on the
   * specified network.
   * @param targetTags targetTags or {@code null} for none
   */
  public Firewall setTargetTags(java.util.List<java.lang.String> targetTags) {
    this.targetTags = targetTags;
    return this;
  }

  @Override
  public Firewall set(String fieldName, Object value) {
    return (Firewall) super.set(fieldName, value);
  }

  @Override
  public Firewall clone() {
    return (Firewall) super.clone();
  }

  /**
   * Model definition for FirewallAllowed.
   */
  public static final class Allowed extends com.google.api.client.json.GenericJson {

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a
     * firewall rule. This value can either be one of the following well known protocol strings (tcp,
     * udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("IPProtocol")
    private java.lang.String iPProtocol;

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP
     * or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     *
     * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> ports;

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a
     * firewall rule. This value can either be one of the following well known protocol strings (tcp,
     * udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * @return value or {@code null} for none
     */
    public java.lang.String getIPProtocol() {
      return iPProtocol;
    }

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a
     * firewall rule. This value can either be one of the following well known protocol strings (tcp,
     * udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * @param iPProtocol iPProtocol or {@code null} for none
     */
    public Allowed setIPProtocol(java.lang.String iPProtocol) {
      this.iPProtocol = iPProtocol;
      return this;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP
     * or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     *
     * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getPorts() {
      return ports;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP
     * or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     *
     * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * @param ports ports or {@code null} for none
     */
    public Allowed setPorts(java.util.List<java.lang.String> ports) {
      this.ports = ports;
      return this;
    }

    @Override
    public Allowed set(String fieldName, Object value) {
      return (Allowed) super.set(fieldName, value);
    }

    @Override
    public Allowed clone() {
      return (Allowed) super.clone();
    }

  }

  /**
   * Model definition for FirewallDenied.
   */
  public static final class Denied extends com.google.api.client.json.GenericJson {

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a
     * firewall rule. This value can either be one of the following well known protocol strings (tcp,
     * udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("IPProtocol")
    private java.lang.String iPProtocol;

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP
     * or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     *
     * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> ports;

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a
     * firewall rule. This value can either be one of the following well known protocol strings (tcp,
     * udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * @return value or {@code null} for none
     */
    public java.lang.String getIPProtocol() {
      return iPProtocol;
    }

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a
     * firewall rule. This value can either be one of the following well known protocol strings (tcp,
     * udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * @param iPProtocol iPProtocol or {@code null} for none
     */
    public Denied setIPProtocol(java.lang.String iPProtocol) {
      this.iPProtocol = iPProtocol;
      return this;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP
     * or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     *
     * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getPorts() {
      return ports;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP
     * or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
     * applies to connections through any port.
     *
     * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * @param ports ports or {@code null} for none
     */
    public Denied setPorts(java.util.List<java.lang.String> ports) {
      this.ports = ports;
      return this;
    }

    @Override
    public Denied set(String fieldName, Object value) {
      return (Denied) super.set(fieldName, value);
    }

    @Override
    public Denied clone() {
      return (Denied) super.clone();
    }

  }

}