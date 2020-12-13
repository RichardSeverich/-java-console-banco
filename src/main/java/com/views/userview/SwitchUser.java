package com.views.userview;

import java.util.Scanner;

import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class SwitchUser {

  /**
  * Constructor.
  */
  private SwitchUser() {
  }

  /**
  * showSwitchUser.
  */
  public static void showSwitchUser() {
    Scanner entradaTeclado = new Scanner(System.in);
    do {
      LimpiarPantalla.limpiar();
      MenuUser.show();
      switch (MenuUser.option = entradaTeclado.nextLine()) {
        case "1":
          RegisterUser.register();
          break;
        case "2":
          ShowAllUsers.showAll();
          break;
        case "3":
          EditUser.edit();
          break;
        case "4":
          RemoveUser.remove();
          break;
        case "5":
          System.out.println("RETURNING");
          break;
        default :
          System.out.println("INCORRECT");
      }
    } while (!MenuUser.option.equals("5"));
  }
}
