package com.utils;

/**
 * Class.
 *
 */
public final class LimpiarPantalla {

  /**
  * Constructor.
  */
  private LimpiarPantalla() {
  }

  /**
  * limpiar.
  */
  public static void limpiar() {
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception error) {
      System.out.println("Este es el error");
      System.out.println(error);
    }
  }
}