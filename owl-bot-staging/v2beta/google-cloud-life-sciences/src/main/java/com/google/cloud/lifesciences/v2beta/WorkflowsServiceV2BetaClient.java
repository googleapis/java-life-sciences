/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.lifesciences.v2beta;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.lifesciences.v2beta.stub.WorkflowsServiceV2BetaStub;
import com.google.cloud.lifesciences.v2beta.stub.WorkflowsServiceV2BetaStubSettings;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service for running workflows, such as pipelines consisting of Docker
 * containers.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
 *     WorkflowsServiceV2BetaClient.create()) {
 *   RunPipelineRequest request =
 *       RunPipelineRequest.newBuilder()
 *           .setParent("parent-995424086")
 *           .setPipeline(Pipeline.newBuilder().build())
 *           .putAllLabels(new HashMap<String, String>())
 *           .setPubSubTopic("pubSubTopic320524524")
 *           .build();
 *   RunPipelineResponse response = workflowsServiceV2BetaClient.runPipelineAsync(request).get();
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the WorkflowsServiceV2BetaClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of WorkflowsServiceV2BetaSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * WorkflowsServiceV2BetaSettings workflowsServiceV2BetaSettings =
 *     WorkflowsServiceV2BetaSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
 *     WorkflowsServiceV2BetaClient.create(workflowsServiceV2BetaSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * WorkflowsServiceV2BetaSettings workflowsServiceV2BetaSettings =
 *     WorkflowsServiceV2BetaSettings.newBuilder().setEndpoint(myEndpoint).build();
 * WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
 *     WorkflowsServiceV2BetaClient.create(workflowsServiceV2BetaSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class WorkflowsServiceV2BetaClient implements BackgroundResource {
  private final WorkflowsServiceV2BetaSettings settings;
  private final WorkflowsServiceV2BetaStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of WorkflowsServiceV2BetaClient with default settings. */
  public static final WorkflowsServiceV2BetaClient create() throws IOException {
    return create(WorkflowsServiceV2BetaSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of WorkflowsServiceV2BetaClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final WorkflowsServiceV2BetaClient create(WorkflowsServiceV2BetaSettings settings)
      throws IOException {
    return new WorkflowsServiceV2BetaClient(settings);
  }

  /**
   * Constructs an instance of WorkflowsServiceV2BetaClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(WorkflowsServiceV2BetaSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final WorkflowsServiceV2BetaClient create(WorkflowsServiceV2BetaStub stub) {
    return new WorkflowsServiceV2BetaClient(stub);
  }

  /**
   * Constructs an instance of WorkflowsServiceV2BetaClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected WorkflowsServiceV2BetaClient(WorkflowsServiceV2BetaSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((WorkflowsServiceV2BetaStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected WorkflowsServiceV2BetaClient(WorkflowsServiceV2BetaStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final WorkflowsServiceV2BetaSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public WorkflowsServiceV2BetaStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs a pipeline. The returned Operation's [metadata] [google.longrunning.Operation.metadata]
   * field will contain a
   * [google.cloud.lifesciences.v2beta.Metadata][google.cloud.lifesciences.v2beta.Metadata] object
   * describing the status of the pipeline execution. The
   * [response][google.longrunning.Operation.response] field will contain a
   * [google.cloud.lifesciences.v2beta.RunPipelineResponse][google.cloud.lifesciences.v2beta.RunPipelineResponse]
   * object if the pipeline completes successfully.
   *
   * <p>&#42;&#42;Note:&#42;&#42; Before you can use this method, the &#42;Life Sciences Service
   * Agent&#42; must have access to your project. This is done automatically when the Cloud Life
   * Sciences API is first enabled, but if you delete this permission you must disable and re-enable
   * the API to grant the Life Sciences Service Agent the required permissions. Authorization
   * requires the following [Google IAM](https://cloud.google.com/iam/) permission:
   *
   * <ul>
   *   <li> `lifesciences.workflows.run`
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
   *     WorkflowsServiceV2BetaClient.create()) {
   *   RunPipelineRequest request =
   *       RunPipelineRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPipeline(Pipeline.newBuilder().build())
   *           .putAllLabels(new HashMap<String, String>())
   *           .setPubSubTopic("pubSubTopic320524524")
   *           .build();
   *   RunPipelineResponse response = workflowsServiceV2BetaClient.runPipelineAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<RunPipelineResponse, Metadata> runPipelineAsync(
      RunPipelineRequest request) {
    return runPipelineOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs a pipeline. The returned Operation's [metadata] [google.longrunning.Operation.metadata]
   * field will contain a
   * [google.cloud.lifesciences.v2beta.Metadata][google.cloud.lifesciences.v2beta.Metadata] object
   * describing the status of the pipeline execution. The
   * [response][google.longrunning.Operation.response] field will contain a
   * [google.cloud.lifesciences.v2beta.RunPipelineResponse][google.cloud.lifesciences.v2beta.RunPipelineResponse]
   * object if the pipeline completes successfully.
   *
   * <p>&#42;&#42;Note:&#42;&#42; Before you can use this method, the &#42;Life Sciences Service
   * Agent&#42; must have access to your project. This is done automatically when the Cloud Life
   * Sciences API is first enabled, but if you delete this permission you must disable and re-enable
   * the API to grant the Life Sciences Service Agent the required permissions. Authorization
   * requires the following [Google IAM](https://cloud.google.com/iam/) permission:
   *
   * <ul>
   *   <li> `lifesciences.workflows.run`
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
   *     WorkflowsServiceV2BetaClient.create()) {
   *   RunPipelineRequest request =
   *       RunPipelineRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPipeline(Pipeline.newBuilder().build())
   *           .putAllLabels(new HashMap<String, String>())
   *           .setPubSubTopic("pubSubTopic320524524")
   *           .build();
   *   OperationFuture<RunPipelineResponse, Metadata> future =
   *       workflowsServiceV2BetaClient.runPipelineOperationCallable().futureCall(request);
   *   // Do something.
   *   RunPipelineResponse response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<RunPipelineRequest, RunPipelineResponse, Metadata>
      runPipelineOperationCallable() {
    return stub.runPipelineOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs a pipeline. The returned Operation's [metadata] [google.longrunning.Operation.metadata]
   * field will contain a
   * [google.cloud.lifesciences.v2beta.Metadata][google.cloud.lifesciences.v2beta.Metadata] object
   * describing the status of the pipeline execution. The
   * [response][google.longrunning.Operation.response] field will contain a
   * [google.cloud.lifesciences.v2beta.RunPipelineResponse][google.cloud.lifesciences.v2beta.RunPipelineResponse]
   * object if the pipeline completes successfully.
   *
   * <p>&#42;&#42;Note:&#42;&#42; Before you can use this method, the &#42;Life Sciences Service
   * Agent&#42; must have access to your project. This is done automatically when the Cloud Life
   * Sciences API is first enabled, but if you delete this permission you must disable and re-enable
   * the API to grant the Life Sciences Service Agent the required permissions. Authorization
   * requires the following [Google IAM](https://cloud.google.com/iam/) permission:
   *
   * <ul>
   *   <li> `lifesciences.workflows.run`
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
   *     WorkflowsServiceV2BetaClient.create()) {
   *   RunPipelineRequest request =
   *       RunPipelineRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPipeline(Pipeline.newBuilder().build())
   *           .putAllLabels(new HashMap<String, String>())
   *           .setPubSubTopic("pubSubTopic320524524")
   *           .build();
   *   ApiFuture<Operation> future =
   *       workflowsServiceV2BetaClient.runPipelineCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RunPipelineRequest, Operation> runPipelineCallable() {
    return stub.runPipelineCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
