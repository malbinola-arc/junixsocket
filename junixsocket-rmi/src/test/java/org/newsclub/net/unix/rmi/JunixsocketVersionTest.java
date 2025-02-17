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
package org.newsclub.net.unix.rmi;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.newsclub.net.unix.AFSocket;

/**
 * Tests whether we can get the junixsocket version (which is encoded in a properties file).
 * 
 * This can't easily be tested from within the Maven build for junixsocket-common, which is why we
 * have it in junixsocket-rmi.
 * 
 * @author Christian Kohlschütter
 */
public class JunixsocketVersionTest {
  @Test
  public void testVersion() {
    String version = AFSocket.getVersion();
    assertNotNull(version);
    assertNotEquals("", version);
  }
}
