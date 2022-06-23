/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.lifesciences.v2beta.samples;

// [START lifesciences_v2beta_generated_workflowsservicev2betaclient_runpipeline_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.lifesciences.v2beta.Pipeline;
import com.google.cloud.lifesciences.v2beta.RunPipelineRequest;
import com.google.cloud.lifesciences.v2beta.WorkflowsServiceV2BetaClient;
import com.google.longrunning.Operation;
import java.util.HashMap;

public class AsyncRunPipeline {

  public static void main(String[] args) throws Exception {
    asyncRunPipeline();
  }

  public static void asyncRunPipeline() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WorkflowsServiceV2BetaClient workflowsServiceV2BetaClient =
        WorkflowsServiceV2BetaClient.create()) {
      RunPipelineRequest request =
          RunPipelineRequest.newBuilder()
              .setParent("parent-995424086")
              .setPipeline(Pipeline.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setPubSubTopic("pubSubTopic320524524")
              .build();
      ApiFuture<Operation> future =
          workflowsServiceV2BetaClient.runPipelineCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END lifesciences_v2beta_generated_workflowsservicev2betaclient_runpipeline_async]
