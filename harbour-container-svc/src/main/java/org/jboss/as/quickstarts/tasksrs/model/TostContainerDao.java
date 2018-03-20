/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.tasksrs.model;

import java.util.List;

import javax.ejb.Local;

/**
 * Basic operations for manipulation of stack
 */
@Local
public interface TostContainerDao {

    void createTask(TosContainerStack stack);

    List<TosContainerStack> getAll();

    List<TosContainerStack> getRange(int offset, int count);

    TosContainerStack getForOrdeNo( String orderNo);

    void deleteStack(TosContainerStack stack);
    void createStack(TosContainerStack stack);
}