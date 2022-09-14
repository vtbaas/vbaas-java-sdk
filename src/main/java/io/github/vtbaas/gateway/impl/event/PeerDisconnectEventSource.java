/*
 * Copyright 2019 IBM All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.vtbaas.gateway.impl.event;

import io.github.vtbaas.gateway.spi.PeerDisconnectEvent;

import java.util.function.Consumer;

/**
 * Allows observing peer disconnect events.
 */
public interface PeerDisconnectEventSource extends AutoCloseable {
    Consumer<PeerDisconnectEvent> addDisconnectListener(Consumer<PeerDisconnectEvent> listener);
    void removeDisconnectListener(Consumer<PeerDisconnectEvent> listener);

    @Override
    void close();
}
