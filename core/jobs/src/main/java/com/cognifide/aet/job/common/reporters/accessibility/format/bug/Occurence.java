/**
 * AET
 *
 * Copyright (C) 2013 Cognifide Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.cognifide.aet.job.common.reporters.accessibility.format.bug;

import java.util.List;

public class Occurence {

  private final String url;

  private final List<Integer> lineNumbers;

  public Occurence(String url, List<Integer> lineNumbers) {
    this.url = url;
    this.lineNumbers = lineNumbers;
  }

  public String getUrl() {
    return url;
  }

  public List<Integer> getLineNumbers() {
    return lineNumbers;
  }
}