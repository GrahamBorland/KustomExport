/*
 * Copyright 2022 Deezer.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package deezer.kustomexport.compiler.js

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName

val coroutinesGlobalScope = ClassName("kotlinx.coroutines", "GlobalScope")
val coroutinesPromiseFunc = MemberName("kotlinx.coroutines", "promise")
val coroutinesAwait = MemberName("kotlinx.coroutines", "await")
val coroutinesPromise = ClassName("kotlin.js", "Promise")
fun TypeName.asCoroutinesPromise() = coroutinesPromise.parameterizedBy(this)
