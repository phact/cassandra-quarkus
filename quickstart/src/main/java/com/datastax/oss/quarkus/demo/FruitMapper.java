/*
 * Copyright DataStax, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datastax.oss.quarkus.demo;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

/**
 * An object mapper defining all the DAOs for this application.
 *
 * <p>The mapper is the main entry point for the DataStax Java driver object mapper. Instances of
 * this interface should be created using {@link FruitMapperBuilder}; this builder is automatically
 * generated by the object mapper.
 *
 * @see <a
 *     href="https://docs.datastax.com/en/developer/java-driver/latest/manual/mapper/mapper/">Using
 *     the Mapper interface</a>
 */
@Mapper
public interface FruitMapper {

  /**
   * Creates a new {@link FruitDao} operating against the given keyspace.
   *
   * @param keyspace The keyspace to use in the new {@link FruitDao}.
   * @return a new {@link FruitDao} operating against the given keyspace.
   */
  @DaoFactory
  FruitDao fruitDao(@DaoKeyspace CqlIdentifier keyspace);

  /**
   * Creates a new {@link FruitDao} operating against the given keyspace.
   *
   * @param keyspace The keyspace to use in the new {@link FruitDao}.
   * @return a new {@link FruitDao} operating against the given keyspace.
   */
  @DaoFactory
  FruitDaoReactive fruitDaoReactive(@DaoKeyspace CqlIdentifier keyspace);
}
