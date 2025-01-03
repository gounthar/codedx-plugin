/*
 * © 2024 Black Duck Software, Inc. All rights reserved worldwide.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package org.jenkinsci.plugins.codedx;

import hudson.model.Result;

public enum BuildErrorBehavior {
	MarkFailed("Mark Build as Failed", Result.FAILURE),
	MarkUnstable("Mark Build as Unstable", Result.UNSTABLE),
	None("Ignore Errors", Result.SUCCESS);

	private final String label;
	private final Result equivalentResult;
	BuildErrorBehavior(String label, Result equivalentResult) {
		this.label = label;
		this.equivalentResult = equivalentResult;
	}

	public String getLabel() {
		return label;
	}
	public Result getEquivalentResult() {
		return equivalentResult;
	}

	public static final BuildErrorBehavior Default = MarkFailed;
}
