/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.apache.ofbiz.testtools;

import groovy.util.GroovyTestCase;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.security.Security;
import org.apache.ofbiz.service.LocalDispatcher;

public class GroovyScriptTestCase extends GroovyTestCase {

    public Delegator delegator;
    public LocalDispatcher dispatcher;
    public Security security;

    public void setDelegator(Delegator delegator) {
        this.delegator = delegator;
    }
    public Delegator getDelegator() {
        return delegator;
    }

    public LocalDispatcher getDispatcher() {
        return dispatcher;
    }
    public void setDispatcher(LocalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    public void setSecurity(Security security) {
        this.security = security;
    }
    public Security getSecurity() {
        return security;
    }
}
