/*-
 * <<
 * task
 * ==
 * Copyright (C) 2019 sia
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */

package com.sia.scheduler.http;

import org.springframework.http.HttpEntity;


/**
 *
 * Provides a class that encapsulates the parameters of the Http request and the url information.
 * The method buildUrl: the url used to set the http request.
 * Method entity Wapper: used to encapsulate the specific parameters of the http request.
 * Specifically confirm the actual type at runtime by affirming generics.
 *
 * @see
 * @author maozhengwei
 * @date 2018-09-28 11:18
 * @version V1.0.0
 **/
public interface Request {

    /**
     * request url
     * @return
     */
    String buildUrl();

    /**
     * request parameters
     * @return
     */
    HttpEntity<?> entityWapper();
}
