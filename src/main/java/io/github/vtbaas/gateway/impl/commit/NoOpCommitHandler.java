/*
 * Copyright 2019 IBM All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.vtbaas.gateway.impl.commit;

import java.util.concurrent.TimeUnit;

import io.github.vtbaas.gateway.spi.CommitHandler;

public enum NoOpCommitHandler implements CommitHandler {
    INSTANCE;

    @Override
    public void startListening() { }

    @Override
    public void waitForEvents(final long timeout, final TimeUnit timeUnit) { }

    @Override
    public void cancelListening() { }
}
