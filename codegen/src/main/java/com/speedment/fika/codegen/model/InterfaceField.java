/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.fika.codegen.model;

import com.speedment.fika.codegen.internal.model.InterfaceFieldImpl;
import com.speedment.fika.codegen.model.modifier.InterfaceFieldModifier;
import com.speedment.fika.codegen.model.trait.HasAnnotationUsage;
import com.speedment.fika.codegen.model.trait.HasCopy;
import com.speedment.fika.codegen.model.trait.HasJavadoc;
import com.speedment.fika.codegen.model.trait.HasName;
import com.speedment.fika.codegen.model.trait.HasType;
import com.speedment.fika.codegen.model.trait.HasValue;

/**
 * A model that represents a field of an interface in code.
 * 
 * @author  Emil Forslund
 * @see     Interface
 * @since  2.0
 */
public interface InterfaceField extends HasName<InterfaceField>, 
    HasType<InterfaceField>, InterfaceFieldModifier<InterfaceField>, 
    HasJavadoc<InterfaceField>, HasValue<InterfaceField>, 
    HasAnnotationUsage<InterfaceField>, HasCopy<InterfaceField> {

    /**
     * Creates a new instance implementing this interface by wrapping an existing
     * {@link Field} in an {@link InterfaceFieldImpl}.
     * 
     * @param wrapped  the wrapped field
     * @return         the new instance
     */
    static InterfaceField of(Field wrapped) {
        return new InterfaceFieldImpl(wrapped);
    }
}