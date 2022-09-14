/*
 * Copyright 2019 IBM All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.vtbaas.gateway;

import java.io.IOException;
import java.nio.file.Path;

import io.github.vtbaas.gateway.impl.FileCheckpointer;
import io.github.vtbaas.gateway.spi.Checkpointer;

/**
 * Provides static factory methods used to create instances of default {@link Checkpointer} implementations.
 */
public final class DefaultCheckpointers {
    /**
     * Checkpointer implementation that persists state to a given file. If the file exists, it must contain valid
     * persistent checkpoint state. If the file does not exist, the checkpointer will be created with default initial
     * state, which will start listening from the current block.
     * <p>The checkpointer will attempt to obtain an exclusive lock on the file so there can only be a single
     * checkpointer instance for a given file at any point in time.</p>
     * @param path A file path.
     * @return A checkpointer.
     * @throws IOException if an error occurs creating the checkpointer.
     */
    public static Checkpointer file(final Path path) throws IOException {
        return new FileCheckpointer(path);
    }

    private DefaultCheckpointers() { }
}
