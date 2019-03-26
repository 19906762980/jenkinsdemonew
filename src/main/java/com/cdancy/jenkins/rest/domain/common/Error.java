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

package com.cdancy.jenkins.rest.domain.common;

import org.jclouds.javax.annotation.Nullable;

public  class Error {

    @Nullable
    public  String context;

    public  String message;

    public  String exceptionName;
    
    Error() {
    }

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExceptionName() {
		return exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}

	public Error(String context, String message, String exceptionName) {
		super();
		this.context = context;
		this.message = message;
		this.exceptionName = exceptionName;
	}

    
}
