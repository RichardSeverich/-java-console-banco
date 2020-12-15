package com.views.assignaccountview;

import java.util.Scanner;

import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class SwitchAssignAcount {

  /**
  * Constructor.
  */
  private SwitchAssignAcount() {
  }

  /**
  * show.
  */
  public static void show() {
    Scanner entradaTeclado = new Scanner(System.in);
    do {
      LimpiarPantalla.limpiar();
      MenuAssignAccount.show();
      switch (MenuAssignAccount.option = entradaTeclado.nextLine()) {
        case "1":
          AssignAccountToClient.assign();
          break;
        case "2":
          RemoveAccountToClient.remove();
          break;
        case "3":
          System.out.println("RETURNING");
          break;
        default:
          System.out.println("INCORRECT");
      }
    } while (!MenuAssignAccount.option.equals("3"));
  }
}
