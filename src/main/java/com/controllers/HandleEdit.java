package com.controllers;

import java.util.ArrayList;

/**
 * Class.
 *
 */
public final class HandleEdit {

  /**
  * Constructor.
  */
  private HandleEdit() {
  }

  /**
  * @param <T> T.
  * @param array array.
  * @param element element.
  * @param index index.
  */
  public static <T> void
      action(final ArrayList<T> array, final T element, final int index) {
    array.set(index, element);
  }
}
