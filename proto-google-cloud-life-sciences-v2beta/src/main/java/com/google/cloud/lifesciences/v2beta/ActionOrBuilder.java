/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface ActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An optional name for the container. The container hostname will be set to
   * this name, making it useful for inter-container communication. The name
   * must contain only upper and lowercase alphanumeric characters and hyphens
   * and cannot start with a hyphen.
   * </pre>
   *
   * <code>string container_name = 1;</code>
   *
   * @return The containerName.
   */
  java.lang.String getContainerName();
  /**
   *
   *
   * <pre>
   * An optional name for the container. The container hostname will be set to
   * this name, making it useful for inter-container communication. The name
   * must contain only upper and lowercase alphanumeric characters and hyphens
   * and cannot start with a hyphen.
   * </pre>
   *
   * <code>string container_name = 1;</code>
   *
   * @return The bytes for containerName.
   */
  com.google.protobuf.ByteString getContainerNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The URI to pull the container image from. Note that all images referenced
   * by actions in the pipeline are pulled before the first action runs. If
   * multiple actions reference the same image, it is only pulled once,
   * ensuring that the same image is used for all actions in a single pipeline.
   * The image URI can be either a complete host and image specification (e.g.,
   * quay.io/biocontainers/samtools), a library and image name (e.g.,
   * google/cloud-sdk) or a bare image name ('bash') to pull from the default
   * library.  No schema is required in any of these cases.
   * If the specified image is not public, the service account specified for
   * the Virtual Machine must have access to pull the images from GCR, or
   * appropriate credentials must be specified in the
   * [google.cloud.lifesciences.v2beta.Action.credentials][google.cloud.lifesciences.v2beta.Action.credentials] field.
   * </pre>
   *
   * <code>string image_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   *
   *
   * <pre>
   * Required. The URI to pull the container image from. Note that all images referenced
   * by actions in the pipeline are pulled before the first action runs. If
   * multiple actions reference the same image, it is only pulled once,
   * ensuring that the same image is used for all actions in a single pipeline.
   * The image URI can be either a complete host and image specification (e.g.,
   * quay.io/biocontainers/samtools), a library and image name (e.g.,
   * google/cloud-sdk) or a bare image name ('bash') to pull from the default
   * library.  No schema is required in any of these cases.
   * If the specified image is not public, the service account specified for
   * the Virtual Machine must have access to pull the images from GCR, or
   * appropriate credentials must be specified in the
   * [google.cloud.lifesciences.v2beta.Action.credentials][google.cloud.lifesciences.v2beta.Action.credentials] field.
   * </pre>
   *
   * <code>string image_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString getImageUriBytes();

  /**
   *
   *
   * <pre>
   * If specified, overrides the `CMD` specified in the container. If the
   * container also has an `ENTRYPOINT` the values are used as entrypoint
   * arguments. Otherwise, they are used as a command and arguments to run
   * inside the container.
   * </pre>
   *
   * <code>repeated string commands = 3;</code>
   *
   * @return A list containing the commands.
   */
  java.util.List<java.lang.String> getCommandsList();
  /**
   *
   *
   * <pre>
   * If specified, overrides the `CMD` specified in the container. If the
   * container also has an `ENTRYPOINT` the values are used as entrypoint
   * arguments. Otherwise, they are used as a command and arguments to run
   * inside the container.
   * </pre>
   *
   * <code>repeated string commands = 3;</code>
   *
   * @return The count of commands.
   */
  int getCommandsCount();
  /**
   *
   *
   * <pre>
   * If specified, overrides the `CMD` specified in the container. If the
   * container also has an `ENTRYPOINT` the values are used as entrypoint
   * arguments. Otherwise, they are used as a command and arguments to run
   * inside the container.
   * </pre>
   *
   * <code>repeated string commands = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The commands at the given index.
   */
  java.lang.String getCommands(int index);
  /**
   *
   *
   * <pre>
   * If specified, overrides the `CMD` specified in the container. If the
   * container also has an `ENTRYPOINT` the values are used as entrypoint
   * arguments. Otherwise, they are used as a command and arguments to run
   * inside the container.
   * </pre>
   *
   * <code>repeated string commands = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the commands at the given index.
   */
  com.google.protobuf.ByteString getCommandsBytes(int index);

  /**
   *
   *
   * <pre>
   * If specified, overrides the `ENTRYPOINT` specified in the container.
   * </pre>
   *
   * <code>string entrypoint = 4;</code>
   *
   * @return The entrypoint.
   */
  java.lang.String getEntrypoint();
  /**
   *
   *
   * <pre>
   * If specified, overrides the `ENTRYPOINT` specified in the container.
   * </pre>
   *
   * <code>string entrypoint = 4;</code>
   *
   * @return The bytes for entrypoint.
   */
  com.google.protobuf.ByteString getEntrypointBytes();

  /**
   *
   *
   * <pre>
   * The environment to pass into the container. This environment is merged
   * with values specified in the [google.cloud.lifesciences.v2beta.Pipeline][google.cloud.lifesciences.v2beta.Pipeline]
   * message, overwriting any duplicate values.
   * In addition to the values passed here, a few other values are
   * automatically injected into the environment. These cannot be hidden or
   * overwritten.
   * `GOOGLE_PIPELINE_FAILED` will be set to "1" if the pipeline failed
   * because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional
   * debug or logging actions should execute.
   * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine
   * authors to determine whether an individual action has succeeded or failed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 5;</code>
   */
  int getEnvironmentCount();
  /**
   *
   *
   * <pre>
   * The environment to pass into the container. This environment is merged
   * with values specified in the [google.cloud.lifesciences.v2beta.Pipeline][google.cloud.lifesciences.v2beta.Pipeline]
   * message, overwriting any duplicate values.
   * In addition to the values passed here, a few other values are
   * automatically injected into the environment. These cannot be hidden or
   * overwritten.
   * `GOOGLE_PIPELINE_FAILED` will be set to "1" if the pipeline failed
   * because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional
   * debug or logging actions should execute.
   * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine
   * authors to determine whether an individual action has succeeded or failed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 5;</code>
   */
  boolean containsEnvironment(java.lang.String key);
  /** Use {@link #getEnvironmentMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEnvironment();
  /**
   *
   *
   * <pre>
   * The environment to pass into the container. This environment is merged
   * with values specified in the [google.cloud.lifesciences.v2beta.Pipeline][google.cloud.lifesciences.v2beta.Pipeline]
   * message, overwriting any duplicate values.
   * In addition to the values passed here, a few other values are
   * automatically injected into the environment. These cannot be hidden or
   * overwritten.
   * `GOOGLE_PIPELINE_FAILED` will be set to "1" if the pipeline failed
   * because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional
   * debug or logging actions should execute.
   * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine
   * authors to determine whether an individual action has succeeded or failed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getEnvironmentMap();
  /**
   *
   *
   * <pre>
   * The environment to pass into the container. This environment is merged
   * with values specified in the [google.cloud.lifesciences.v2beta.Pipeline][google.cloud.lifesciences.v2beta.Pipeline]
   * message, overwriting any duplicate values.
   * In addition to the values passed here, a few other values are
   * automatically injected into the environment. These cannot be hidden or
   * overwritten.
   * `GOOGLE_PIPELINE_FAILED` will be set to "1" if the pipeline failed
   * because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional
   * debug or logging actions should execute.
   * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine
   * authors to determine whether an individual action has succeeded or failed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 5;</code>
   */
  java.lang.String getEnvironmentOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The environment to pass into the container. This environment is merged
   * with values specified in the [google.cloud.lifesciences.v2beta.Pipeline][google.cloud.lifesciences.v2beta.Pipeline]
   * message, overwriting any duplicate values.
   * In addition to the values passed here, a few other values are
   * automatically injected into the environment. These cannot be hidden or
   * overwritten.
   * `GOOGLE_PIPELINE_FAILED` will be set to "1" if the pipeline failed
   * because an action has exited with a non-zero status (and did not have the
   * `IGNORE_EXIT_STATUS` flag set). This can be used to determine if additional
   * debug or logging actions should execute.
   * `GOOGLE_LAST_EXIT_STATUS` will be set to the exit status of the last
   * non-background action that executed. This can be used by workflow engine
   * authors to determine whether an individual action has succeeded or failed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 5;</code>
   */
  java.lang.String getEnvironmentOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * An optional identifier for a PID namespace to run the action inside.
   * Multiple actions should use the same string to share a namespace.  If
   * unspecified, a separate isolated namespace is used.
   * </pre>
   *
   * <code>string pid_namespace = 6;</code>
   *
   * @return The pidNamespace.
   */
  java.lang.String getPidNamespace();
  /**
   *
   *
   * <pre>
   * An optional identifier for a PID namespace to run the action inside.
   * Multiple actions should use the same string to share a namespace.  If
   * unspecified, a separate isolated namespace is used.
   * </pre>
   *
   * <code>string pid_namespace = 6;</code>
   *
   * @return The bytes for pidNamespace.
   */
  com.google.protobuf.ByteString getPidNamespaceBytes();

  /**
   *
   *
   * <pre>
   * A map of containers to host port mappings for this container. If the
   * container already specifies exposed ports, use the
   * `PUBLISH_EXPOSED_PORTS` flag instead.
   * The host port number must be less than 65536. If it is zero, an unused
   * random port is assigned. To determine the resulting port number, consult
   * the `ContainerStartedEvent` in the operation metadata.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; port_mappings = 8;</code>
   */
  int getPortMappingsCount();
  /**
   *
   *
   * <pre>
   * A map of containers to host port mappings for this container. If the
   * container already specifies exposed ports, use the
   * `PUBLISH_EXPOSED_PORTS` flag instead.
   * The host port number must be less than 65536. If it is zero, an unused
   * random port is assigned. To determine the resulting port number, consult
   * the `ContainerStartedEvent` in the operation metadata.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; port_mappings = 8;</code>
   */
  boolean containsPortMappings(int key);
  /** Use {@link #getPortMappingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer> getPortMappings();
  /**
   *
   *
   * <pre>
   * A map of containers to host port mappings for this container. If the
   * container already specifies exposed ports, use the
   * `PUBLISH_EXPOSED_PORTS` flag instead.
   * The host port number must be less than 65536. If it is zero, an unused
   * random port is assigned. To determine the resulting port number, consult
   * the `ContainerStartedEvent` in the operation metadata.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; port_mappings = 8;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer> getPortMappingsMap();
  /**
   *
   *
   * <pre>
   * A map of containers to host port mappings for this container. If the
   * container already specifies exposed ports, use the
   * `PUBLISH_EXPOSED_PORTS` flag instead.
   * The host port number must be less than 65536. If it is zero, an unused
   * random port is assigned. To determine the resulting port number, consult
   * the `ContainerStartedEvent` in the operation metadata.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; port_mappings = 8;</code>
   */
  int getPortMappingsOrDefault(int key, int defaultValue);
  /**
   *
   *
   * <pre>
   * A map of containers to host port mappings for this container. If the
   * container already specifies exposed ports, use the
   * `PUBLISH_EXPOSED_PORTS` flag instead.
   * The host port number must be less than 65536. If it is zero, an unused
   * random port is assigned. To determine the resulting port number, consult
   * the `ContainerStartedEvent` in the operation metadata.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; port_mappings = 8;</code>
   */
  int getPortMappingsOrThrow(int key);

  /**
   *
   *
   * <pre>
   * A list of mounts to make available to the action.
   * In addition to the values specified here, every action has a special
   * virtual disk mounted under `/google` that contains log files and other
   * operational components.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs written during the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined standard output and
   *   standard error of all actions run as part of the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stdout&lt;/code&gt; The complete contents of
   *   each individual action's standard output.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stderr&lt;/code&gt; The complete contents of
   *   each individual action's standard error output.&lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Mount mounts = 9;</code>
   */
  java.util.List<com.google.cloud.lifesciences.v2beta.Mount> getMountsList();
  /**
   *
   *
   * <pre>
   * A list of mounts to make available to the action.
   * In addition to the values specified here, every action has a special
   * virtual disk mounted under `/google` that contains log files and other
   * operational components.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs written during the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined standard output and
   *   standard error of all actions run as part of the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stdout&lt;/code&gt; The complete contents of
   *   each individual action's standard output.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stderr&lt;/code&gt; The complete contents of
   *   each individual action's standard error output.&lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Mount mounts = 9;</code>
   */
  com.google.cloud.lifesciences.v2beta.Mount getMounts(int index);
  /**
   *
   *
   * <pre>
   * A list of mounts to make available to the action.
   * In addition to the values specified here, every action has a special
   * virtual disk mounted under `/google` that contains log files and other
   * operational components.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs written during the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined standard output and
   *   standard error of all actions run as part of the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stdout&lt;/code&gt; The complete contents of
   *   each individual action's standard output.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stderr&lt;/code&gt; The complete contents of
   *   each individual action's standard error output.&lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Mount mounts = 9;</code>
   */
  int getMountsCount();
  /**
   *
   *
   * <pre>
   * A list of mounts to make available to the action.
   * In addition to the values specified here, every action has a special
   * virtual disk mounted under `/google` that contains log files and other
   * operational components.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs written during the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined standard output and
   *   standard error of all actions run as part of the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stdout&lt;/code&gt; The complete contents of
   *   each individual action's standard output.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stderr&lt;/code&gt; The complete contents of
   *   each individual action's standard error output.&lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Mount mounts = 9;</code>
   */
  java.util.List<? extends com.google.cloud.lifesciences.v2beta.MountOrBuilder>
      getMountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of mounts to make available to the action.
   * In addition to the values specified here, every action has a special
   * virtual disk mounted under `/google` that contains log files and other
   * operational components.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs&lt;/code&gt; All logs written during the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/output&lt;/code&gt; The combined standard output and
   *   standard error of all actions run as part of the pipeline
   *   execution.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stdout&lt;/code&gt; The complete contents of
   *   each individual action's standard output.&lt;/li&gt;
   *   &lt;li&gt;&lt;code&gt;/google/logs/action/&#42;&#47;stderr&lt;/code&gt; The complete contents of
   *   each individual action's standard error output.&lt;/li&gt;
   * &lt;/ul&gt;
   * </pre>
   *
   * <code>repeated .google.cloud.lifesciences.v2beta.Mount mounts = 9;</code>
   */
  com.google.cloud.lifesciences.v2beta.MountOrBuilder getMountsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Labels to associate with the action. This field is provided to assist
   * workflow engine authors in identifying actions (for example, to indicate
   * what sort of action they perform, such as localization or debugging).
   * They are returned in the operation metadata, but are otherwise ignored.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to associate with the action. This field is provided to assist
   * workflow engine authors in identifying actions (for example, to indicate
   * what sort of action they perform, such as localization or debugging).
   * They are returned in the operation metadata, but are otherwise ignored.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to associate with the action. This field is provided to assist
   * workflow engine authors in identifying actions (for example, to indicate
   * what sort of action they perform, such as localization or debugging).
   * They are returned in the operation metadata, but are otherwise ignored.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to associate with the action. This field is provided to assist
   * workflow engine authors in identifying actions (for example, to indicate
   * what sort of action they perform, such as localization or debugging).
   * They are returned in the operation metadata, but are otherwise ignored.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to associate with the action. This field is provided to assist
   * workflow engine authors in identifying actions (for example, to indicate
   * what sort of action they perform, such as localization or debugging).
   * They are returned in the operation metadata, but are otherwise ignored.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * If the specified image is hosted on a private registry other than Google
   * Container Registry, the credentials required to pull the image must be
   * specified here as an encrypted secret.
   * The secret must decrypt to a JSON-encoded dictionary containing both
   * `username` and `password` keys.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Secret credentials = 11;</code>
   *
   * @return Whether the credentials field is set.
   */
  boolean hasCredentials();
  /**
   *
   *
   * <pre>
   * If the specified image is hosted on a private registry other than Google
   * Container Registry, the credentials required to pull the image must be
   * specified here as an encrypted secret.
   * The secret must decrypt to a JSON-encoded dictionary containing both
   * `username` and `password` keys.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Secret credentials = 11;</code>
   *
   * @return The credentials.
   */
  com.google.cloud.lifesciences.v2beta.Secret getCredentials();
  /**
   *
   *
   * <pre>
   * If the specified image is hosted on a private registry other than Google
   * Container Registry, the credentials required to pull the image must be
   * specified here as an encrypted secret.
   * The secret must decrypt to a JSON-encoded dictionary containing both
   * `username` and `password` keys.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.Secret credentials = 11;</code>
   */
  com.google.cloud.lifesciences.v2beta.SecretOrBuilder getCredentialsOrBuilder();

  /**
   *
   *
   * <pre>
   * The maximum amount of time to give the action to complete. If the action
   * fails to complete before the timeout, it will be terminated and the exit
   * status will be non-zero. The pipeline will continue or terminate based
   * on the rules defined by the `ALWAYS_RUN` and `IGNORE_EXIT_STATUS` flags.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * The maximum amount of time to give the action to complete. If the action
   * fails to complete before the timeout, it will be terminated and the exit
   * status will be non-zero. The pipeline will continue or terminate based
   * on the rules defined by the `ALWAYS_RUN` and `IGNORE_EXIT_STATUS` flags.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * The maximum amount of time to give the action to complete. If the action
   * fails to complete before the timeout, it will be terminated and the exit
   * status will be non-zero. The pipeline will continue or terminate based
   * on the rules defined by the `ALWAYS_RUN` and `IGNORE_EXIT_STATUS` flags.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Normally, a non-zero exit status causes the pipeline to fail. This flag
   * allows execution of other actions to continue instead.
   * </pre>
   *
   * <code>bool ignore_exit_status = 13;</code>
   *
   * @return The ignoreExitStatus.
   */
  boolean getIgnoreExitStatus();

  /**
   *
   *
   * <pre>
   * This flag allows an action to continue running in the background while
   * executing subsequent actions. This is useful to provide services to
   * other actions (or to provide debugging support tools like SSH servers).
   * </pre>
   *
   * <code>bool run_in_background = 14;</code>
   *
   * @return The runInBackground.
   */
  boolean getRunInBackground();

  /**
   *
   *
   * <pre>
   * By default, after an action fails, no further actions are run. This flag
   * indicates that this action must be run even if the pipeline has already
   * failed. This is useful for actions that copy output files off of the VM
   * or for debugging. Note that no actions will be run if image prefetching
   * fails.
   * </pre>
   *
   * <code>bool always_run = 15;</code>
   *
   * @return The alwaysRun.
   */
  boolean getAlwaysRun();

  /**
   *
   *
   * <pre>
   * Enable access to the FUSE device for this action. Filesystems can then
   * be mounted into disks shared with other actions. The other actions do
   * not need the `enable_fuse` flag to access the mounted filesystem.
   * This has the effect of causing the container to be executed with
   * `CAP_SYS_ADMIN` and exposes `/dev/fuse` to the container, so use it only
   * for containers you trust.
   * </pre>
   *
   * <code>bool enable_fuse = 16;</code>
   *
   * @return The enableFuse.
   */
  boolean getEnableFuse();

  /**
   *
   *
   * <pre>
   * Exposes all ports specified by `EXPOSE` statements in the container. To
   * discover the host side port numbers, consult the `ACTION_STARTED` event
   * in the operation metadata.
   * </pre>
   *
   * <code>bool publish_exposed_ports = 17;</code>
   *
   * @return The publishExposedPorts.
   */
  boolean getPublishExposedPorts();

  /**
   *
   *
   * <pre>
   * All container images are typically downloaded before any actions are
   * executed. This helps prevent typos in URIs or issues like lack of disk
   * space from wasting large amounts of compute resources.
   * If set, this flag prevents the worker from downloading the image until
   * just before the action is executed.
   * </pre>
   *
   * <code>bool disable_image_prefetch = 18;</code>
   *
   * @return The disableImagePrefetch.
   */
  boolean getDisableImagePrefetch();

  /**
   *
   *
   * <pre>
   * A small portion of the container's standard error stream is typically
   * captured and returned inside the `ContainerStoppedEvent`. Setting this
   * flag disables this functionality.
   * </pre>
   *
   * <code>bool disable_standard_error_capture = 19;</code>
   *
   * @return The disableStandardErrorCapture.
   */
  boolean getDisableStandardErrorCapture();

  /**
   *
   *
   * <pre>
   * Prevents the container from accessing the external network.
   * </pre>
   *
   * <code>bool block_external_network = 20;</code>
   *
   * @return The blockExternalNetwork.
   */
  boolean getBlockExternalNetwork();
}
