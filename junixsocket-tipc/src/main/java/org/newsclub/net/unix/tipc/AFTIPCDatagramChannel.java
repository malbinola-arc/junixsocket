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
package org.newsclub.net.unix.tipc;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.nio.channels.DatagramChannel;

import org.newsclub.net.unix.AFDatagramChannel;
import org.newsclub.net.unix.AFTIPCSocketAddress;

/**
 * A {@link DatagramChannel} implementation that works with {@code AF_TIPC} sockets.
 * 
 * @author Christian Kohlschütter
 */
public final class AFTIPCDatagramChannel extends AFDatagramChannel<AFTIPCSocketAddress> implements
    AFTIPCSocketExtensions {
  AFTIPCDatagramChannel(AFTIPCDatagramSocket socket) {
    super(AFTIPCSelectorProvider.getInstance(), socket);
  }

  /**
   * Opens a datagram channel.
   *
   * @return The new channel
   * @throws IOException if an I/O error occurs
   */
  public static AFTIPCDatagramChannel open() throws IOException {
    return AFTIPCSelectorProvider.provider().openDatagramChannel();
  }

  /**
   * Opens a datagram channel.
   *
   * @param family The protocol family
   * @return A new datagram channel
   *
   * @throws UnsupportedOperationException if the specified protocol family is not supported
   * @throws IOException if an I/O error occurs
   */
  public static AFTIPCDatagramChannel open(ProtocolFamily family) throws IOException {
    return AFTIPCSelectorProvider.provider().openDatagramChannel(family);
  }

  @Override
  public AFTIPCErrInfo getErrInfo() {
    return ((AFTIPCSocketExtensions) getAFSocket()).getErrInfo();
  }

  @Override
  public AFTIPCDestName getDestName() {
    return ((AFTIPCSocketExtensions) getAFSocket()).getDestName();
  }
}
