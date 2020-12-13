package com.controllers;

import java.util.ArrayList;

import com.models.IModel;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class HandleFindById {

  /**
  * Constructor.
  */
  private HandleFindById() {
  }

  /**
  * @param <T> T.
  * @param array array.
  * @param uuid uuid.
  * @return Tuple.
  */
  public static <T extends IModel> Tuple<T>
      action(final ArrayList<T> array, final String uuid) {
    Tuple<T> tuple;
    int index = 0;
    for (T element : array) {
      if (element.uuid.equals(uuid)) {
        tuple = new Tuple<>(element, index);
        return tuple;
      }
      index++;
    }
    return null;
  }
}
