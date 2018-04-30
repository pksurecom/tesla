/*
 * Copyright 2014-2017 the original author or authors.
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
package io.github.tesla.gateway.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.jsonpath.spi.json.GsonJsonProvider;

/**
 * @author liushiming
 * @version JsonUtils.java, v 0.0.1 2018年4月24日 上午10:45:21 liushiming
 */
public class JsonUtils {

  public static final GsonJsonProvider jsonProvider = new GsonJsonProvider();

  public static Object parse(String json) {
    return jsonProvider.parse(json);
  }

  private static final Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
      .enableComplexMapKeySerialization().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss:SSS")
      .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setPrettyPrinting().setVersion(1.0)
      .create();

  public static Gson getGson() {
    return gson;
  }


}