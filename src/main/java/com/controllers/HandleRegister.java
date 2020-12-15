package com.controllers;

import java.util.ArrayList;

/**
 * Class.
 *
 */
public final class HandleRegister {

  /**
  * Constructor.
  */
  private HandleRegister() {
  }

  /**
  * @param <T> T.
  * @param array array.
  *  @param element element.
  */
  public static <T> void action(final ArrayList<T> array, final T element) {
    array.add(element);
  }
}
