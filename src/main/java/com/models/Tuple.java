package com.models;

/**
 * Class.
 * @param <T> <T>.
 */
public class Tuple<T extends IModel> {
  public final int index;
  public final T element;

  /**
  * @param element element.
  *  @param index index.
  */
  public Tuple(final T element, final int index) {
    this.index = index;
    this.element = element;
  }
}
