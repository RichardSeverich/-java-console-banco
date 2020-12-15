package com.views.clientview;

import java.util.Scanner;

import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class SwitchClient {

  /**
  * Constructor.
  */
  private SwitchClient() {
  }

  /**
  * showSwitchClient.
  */
  public static void showSwitchClient() {
    Scanner entradaTeclado = new Scanner(System.in);
    do {
      LimpiarPantalla.limpiar();
      MenuClient.show();
      switch (MenuClient.option = entradaTeclado.nextLine()) {
        case "1":
          RegisterClient.register();
          break;
        case "2":
          ShowAllClients.showAll();
          break;
        case "3":
          EditClient.edit();
          break;
        case "4":
          RemoveClient.remove();
          break;
        case "5":
          System.out.println("RETURNING");
          break;
        default :
          System.out.println("INCORRECT");
      }
    } while (!MenuClient.option.equals("5"));
  }
}
