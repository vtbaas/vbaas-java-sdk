/*
 * Copyright 2019 IBM All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.vtbaas.gateway.spi;

import io.github.vtbaas.gateway.Network;

/**
 * Functional interface describing a factory function for constructing {@link QueryHandler} instances.
 * <p>Default implementations can be obtained from {@link org.hyperledger.fabric.gateway.DefaultQueryHandlers}.</p>
 */
@FunctionalInterface
public interface QueryHandlerFactory {
  /**
   * Factory function to create a query handler instance.
   * @param network Network on which the query is invoked.
   * @return A query handler.
   */
  QueryHandler create(Network network);
}
