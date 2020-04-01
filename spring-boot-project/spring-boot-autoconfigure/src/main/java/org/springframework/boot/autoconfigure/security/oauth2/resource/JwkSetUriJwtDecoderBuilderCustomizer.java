/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.boot.autoconfigure.security.oauth2.resource;

import static org.springframework.security.oauth2.jwt.NimbusJwtDecoder.*;

import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

/**
 * Callback interface that can be used to customize a {@link JwkSetUriJwtDecoderBuilder}
 * before creating the JwtDecoder.
 *
 * @author Michael Kreis
 * @since 2.2.7
 * @see NimbusJwtDecoder
 */
@FunctionalInterface
public interface JwkSetUriJwtDecoderBuilderCustomizer {

	/**
	 * Callback to customize {@link JwkSetUriJwtDecoderBuilder}
	 * @param jwtDecoderBuilder the builder to customize
	 */
	void customize(JwkSetUriJwtDecoderBuilder jwtDecoderBuilder);

}
