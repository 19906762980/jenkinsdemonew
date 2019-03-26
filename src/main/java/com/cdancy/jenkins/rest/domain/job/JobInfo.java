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

import com.cdancy.jenkins.rest.domain.queue.QueueItem;

public  class JobInfo {

   @Nullable
   public  String description;

   @Nullable
   public  String displayName;

   @Nullable
   public  String displayNameOrNull;

   public  String name;

   public  String url;

   public  boolean buildable;

   public  List<BuildInfo> builds;

   public  String color;

   @Nullable
   public  BuildInfo firstBuild;

   public  boolean inQueue;

   public  boolean keepDependencies;

   @Nullable
   public  BuildInfo lastBuild;

   @Nullable
   public  BuildInfo lastCompleteBuild;

   @Nullable
   public  BuildInfo lastFailedBuild;

   @Nullable
   public  BuildInfo lastStableBuild;

   @Nullable
   public  BuildInfo lastSuccessfulBuild;

   @Nullable
   public  BuildInfo lastUnstableBuild;

   @Nullable
   public  BuildInfo lastUnsuccessfulBuild;

   public  int nextBuildNumber;

   @Nullable
   public  QueueItem queueItem;

   public  boolean concurrentBuild;

   JobInfo() {
   }

   
}
