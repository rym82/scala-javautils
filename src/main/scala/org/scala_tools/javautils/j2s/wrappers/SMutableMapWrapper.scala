/**
 * Copyright 2009 Jorge Ortiz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 **/
package org.scala_tools.javautils.j2s.wrappers

import java.util.Map
import scala.collection.mutable.{Map => SMutableMap}

trait SMutableMapWrapper[K, V] extends SMutableMap[K, V] with SMapWrapper[K, V] {
  type Wrapped <: Map[K, V]

  def -=(key: K): Unit =
    underlying.remove(key)

  def update(key: K, value: V): Unit =
    underlying.put(key, value)
}