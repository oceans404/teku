/*
 * Copyright 2020 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.teku.api.response.v1.beacon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@SuppressWarnings("JavaCase")
public class GetStateValidatorResponse {
  @JsonProperty("execution_optimistic")
  @JsonInclude(Include.NON_NULL)
  @Schema(hidden = true)
  public final Boolean execution_optimistic;

  @JsonProperty("data")
  public final ValidatorResponse data;

  @JsonCreator
  public GetStateValidatorResponse(
      @JsonProperty("execution_optimistic") final Boolean executionOptimistic,
      @JsonProperty("data") final ValidatorResponse data) {
    this.execution_optimistic = executionOptimistic;
    this.data = data;
  }
}
