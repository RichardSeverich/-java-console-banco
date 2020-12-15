package com.controllers;

import java.util.ArrayList;

/**
 * Class.
 *
 */
public final class HandleRemove {

  /**
  * Constructor.
  */
  private HandleRemove() {
  }

  /**
  * @param <T> T.
  * @param array array.
  *  @param index index.
  */
  public static <T> void action(final ArrayList<T> array, final int index) {
    array.remove(index);
  }
}
