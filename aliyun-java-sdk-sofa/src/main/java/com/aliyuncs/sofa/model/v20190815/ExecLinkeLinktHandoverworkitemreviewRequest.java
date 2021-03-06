/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeLinktHandoverworkitemreviewRequest extends RpcAcsRequest<ExecLinkeLinktHandoverworkitemreviewResponse> {
	   

	private Long workItemReviewId;

	private String reviewer;
	public ExecLinkeLinktHandoverworkitemreviewRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinktHandoverworkitemreview", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getWorkItemReviewId() {
		return this.workItemReviewId;
	}

	public void setWorkItemReviewId(Long workItemReviewId) {
		this.workItemReviewId = workItemReviewId;
		if(workItemReviewId != null){
			putBodyParameter("WorkItemReviewId", workItemReviewId.toString());
		}
	}

	public String getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
		if(reviewer != null){
			putBodyParameter("Reviewer", reviewer);
		}
	}

	@Override
	public Class<ExecLinkeLinktHandoverworkitemreviewResponse> getResponseClass() {
		return ExecLinkeLinktHandoverworkitemreviewResponse.class;
	}

}
