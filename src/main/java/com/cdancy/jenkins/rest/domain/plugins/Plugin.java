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

package com.cdancy.jenkins.rest.domain.plugins;


import org.jclouds.json.SerializedNames;

import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;

@AutoValue
public  class Plugin {

    @Nullable
    public  Boolean active;

    @Nullable
    public  String backupVersion;
    
    @Nullable    
    public  Boolean bundled;

    @Nullable
    public  Boolean deleted;

    @Nullable
    public  Boolean downgradable;

    @Nullable
    public  Boolean enabled;

    @Nullable    
    public  Boolean hasUpdate;

    @Nullable    
    public  String longName;

    @Nullable    
    public  Boolean pinned;

    @Nullable    
    public  String requiredCoreVersion;

    @Nullable    
    public  String shortName;

    @Nullable    
    public  String supportsDynamicLoad;

    @Nullable    
    public  String url;

    @Nullable    
    public  String version;

    Plugin() {
    }

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getBackupVersion() {
		return backupVersion;
	}

	public void setBackupVersion(String backupVersion) {
		this.backupVersion = backupVersion;
	}

	public Boolean getBundled() {
		return bundled;
	}

	public void setBundled(Boolean bundled) {
		this.bundled = bundled;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getDowngradable() {
		return downgradable;
	}

	public void setDowngradable(Boolean downgradable) {
		this.downgradable = downgradable;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getHasUpdate() {
		return hasUpdate;
	}

	public void setHasUpdate(Boolean hasUpdate) {
		this.hasUpdate = hasUpdate;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public Boolean getPinned() {
		return pinned;
	}

	public void setPinned(Boolean pinned) {
		this.pinned = pinned;
	}

	public String getRequiredCoreVersion() {
		return requiredCoreVersion;
	}

	public void setRequiredCoreVersion(String requiredCoreVersion) {
		this.requiredCoreVersion = requiredCoreVersion;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSupportsDynamicLoad() {
		return supportsDynamicLoad;
	}

	public void setSupportsDynamicLoad(String supportsDynamicLoad) {
		this.supportsDynamicLoad = supportsDynamicLoad;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
