package com.linkedin.avro.api;

import java.util.List;


/**
 * A {@link List} implementation with additional functions to prevent boxing.
 */
public interface PrimitiveDoubleList extends List<Double> {
  /**
   * @param index index of the element to return
   * @return the element at the specified position in this list
   */
  double getPrimitive(int index);

  /**
   * @param e element whose presence in this collection is to be ensured
   * @return <tt>true</tt> if this collection changed as a result of the call
   */
  boolean addPrimitive(double e);
}