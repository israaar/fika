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
package com.speedment.fika.codegen.internal.java.view.trait;

import com.speedment.fika.codegen.Generator;
import com.speedment.fika.codegen.Transform;
import com.speedment.fika.codegen.model.trait.HasAnnotationUsage;
import static com.speedment.fika.codegen.internal.util.Formatting.EMPTY;
import static com.speedment.fika.codegen.internal.util.Formatting.nl;
import static com.speedment.fika.codegen.internal.util.CollectorUtil.joinIfNotEmpty;

/**
 * A trait with the functionality to render models with the trait 
 * {@link HasAnnotationUsage}.
 * 
 * @author     Emil Forslund
 * @param <M>  The model type
 * @see        Transform
 */
public interface HasAnnotationUsageView<M extends HasAnnotationUsage<M>> extends 
    Transform<M, String> {
    
    /**
     * Renders all annotations in the specified model separated by new-line
     * characters.
     * 
     * @param gen    the generator
     * @param model  the model with the annotations
     * @return       the generated code
     */
    default String renderAnnotations(Generator gen, M model) {
        return gen.onEach(model.getAnnotations())
            .collect(joinIfNotEmpty(nl(), EMPTY, nl()));
    }
}