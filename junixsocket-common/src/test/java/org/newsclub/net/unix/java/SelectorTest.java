/*
 * junixsocket
 *
 * Copyright 2009-2022 Christian Kohlschütter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.newsclub.net.unix.java;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;

@SuppressFBWarnings("NM_SAME_SIMPLE_NAME_AS_SUPERCLASS")
@JavaInetStackRequirement
public final class SelectorTest extends org.newsclub.net.unix.SelectorTest<InetSocketAddress> {

  public SelectorTest() throws IOException {
    super(JavaAddressSpecifics.INSTANCE);
  }
}
