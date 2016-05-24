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
package com.speedment.fika.codegen.internal.java;

import com.speedment.fika.codegen.Generator;
import com.speedment.fika.codegen.Transform;
import com.speedment.fika.codegen.internal.java.trait.HasCodeView;
import com.speedment.fika.codegen.internal.java.trait.HasModifiersView;
import com.speedment.fika.codegen.model.Initializer;
import static java.util.Objects.requireNonNull;
import java.util.Optional;

/**
 * Transforms from an {@link Initializer} to java code.
 * 
 * @author Emil Forslund
 */
public final class InitalizerView implements Transform<Initializer, String>,
        HasModifiersView<Initializer>,
        HasCodeView<Initializer> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<String> transform(Generator gen, Initializer model) {
        requireNonNull(gen);
        requireNonNull(model);
        
        return Optional.of(
            renderModifiers(gen, model) +
            renderCode(gen, model)
        );
    }
}