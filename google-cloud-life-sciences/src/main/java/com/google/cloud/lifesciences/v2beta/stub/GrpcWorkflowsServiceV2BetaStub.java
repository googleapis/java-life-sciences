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

package com.google.cloud.lifesciences.v2beta.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.lifesciences.v2beta.Metadata;
import com.google.cloud.lifesciences.v2beta.RunPipelineRequest;
import com.google.cloud.lifesciences.v2beta.RunPipelineResponse;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the WorkflowsServiceV2Beta service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcWorkflowsServiceV2BetaStub extends WorkflowsServiceV2BetaStub {
  private static final MethodDescriptor<RunPipelineRequest, Operation> runPipelineMethodDescriptor =
      MethodDescriptor.<RunPipelineRequest, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.lifesciences.v2beta.WorkflowsServiceV2Beta/RunPipeline")
          .setRequestMarshaller(ProtoUtils.marshaller(RunPipelineRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();

  private final UnaryCallable<RunPipelineRequest, Operation> runPipelineCallable;
  private final OperationCallable<RunPipelineRequest, RunPipelineResponse, Metadata>
      runPipelineOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcWorkflowsServiceV2BetaStub create(
      WorkflowsServiceV2BetaStubSettings settings) throws IOException {
    return new GrpcWorkflowsServiceV2BetaStub(settings, ClientContext.create(settings));
  }

  public static final GrpcWorkflowsServiceV2BetaStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcWorkflowsServiceV2BetaStub(
        WorkflowsServiceV2BetaStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcWorkflowsServiceV2BetaStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcWorkflowsServiceV2BetaStub(
        WorkflowsServiceV2BetaStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcWorkflowsServiceV2BetaStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcWorkflowsServiceV2BetaStub(
      WorkflowsServiceV2BetaStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcWorkflowsServiceV2BetaCallableFactory());
  }

  /**
   * Constructs an instance of GrpcWorkflowsServiceV2BetaStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcWorkflowsServiceV2BetaStub(
      WorkflowsServiceV2BetaStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<RunPipelineRequest, Operation> runPipelineTransportSettings =
        GrpcCallSettings.<RunPipelineRequest, Operation>newBuilder()
            .setMethodDescriptor(runPipelineMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<RunPipelineRequest>() {
                  @Override
                  public Map<String, String> extract(RunPipelineRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();

    this.runPipelineCallable =
        callableFactory.createUnaryCallable(
            runPipelineTransportSettings, settings.runPipelineSettings(), clientContext);
    this.runPipelineOperationCallable =
        callableFactory.createOperationCallable(
            runPipelineTransportSettings,
            settings.runPipelineOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<RunPipelineRequest, Operation> runPipelineCallable() {
    return runPipelineCallable;
  }

  @Override
  public OperationCallable<RunPipelineRequest, RunPipelineResponse, Metadata>
      runPipelineOperationCallable() {
    return runPipelineOperationCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
