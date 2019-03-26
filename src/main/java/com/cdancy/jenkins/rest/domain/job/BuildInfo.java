/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cdancy.jenkins.rest.domain.job;

import java.util.List;

import org.jclouds.javax.annotation.Nullable;

public abstract class BuildInfo {

	public List<Artifact> artifacts;

	public List<Action> actions;

	public boolean building;

	@Nullable
	public String description;

	@Nullable
	public String displayName;

	public long duration;

	public long estimatedDuration;

	@Nullable
	public String fullDisplayName;

	@Nullable
	public String id;

	public boolean keepLog;

	public int number;

	public int queueId;

	@Nullable
	public String result;

	public long timestamp;

	@Nullable
	public String url;

	@Nullable
	public String builtOn;

	public List<Culprit> culprits;

	public List<Artifact> getArtifacts() {
		return artifacts;
	}

	public void setArtifacts(List<Artifact> artifacts) {
		this.artifacts = artifacts;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public boolean isBuilding() {
		return building;
	}

	public void setBuilding(boolean building) {
		this.building = building;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public long getEstimatedDuration() {
		return estimatedDuration;
	}

	public void setEstimatedDuration(long estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	public String getFullDisplayName() {
		return fullDisplayName;
	}

	public void setFullDisplayName(String fullDisplayName) {
		this.fullDisplayName = fullDisplayName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isKeepLog() {
		return keepLog;
	}

	public void setKeepLog(boolean keepLog) {
		this.keepLog = keepLog;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getQueueId() {
		return queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBuiltOn() {
		return builtOn;
	}

	public void setBuiltOn(String builtOn) {
		this.builtOn = builtOn;
	}

	public List<Culprit> getCulprits() {
		return culprits;
	}

	public void setCulprits(List<Culprit> culprits) {
		this.culprits = culprits;
	}

	BuildInfo() {
	}

}
