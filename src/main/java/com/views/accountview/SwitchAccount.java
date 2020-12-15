package com.views.accountview;

import java.util.Scanner;

import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class SwitchAccount {

  /**
  * Constructor.
  */
  private SwitchAccount() {
  }

  /**
  * showSwitchAccount.
  */
  public static void showSwitchAccount() {
    Scanner entradaTeclado = new Scanner(System.in);
    do {
      LimpiarPantalla.limpiar();
      MenuAccount.show();
      switch (MenuAccount.option = entradaTeclado.nextLine()) {
        case "1":
          RegisterAccount.register();
          break;
        case "2":
          ShowAllAccounts.showAll();
          break;
        case "3":
          EditAccount.edit();
          break;
        case "4":
          RemoveAccount.remove();
          break;
        case "5":
          System.out.println("RETURNING");
          break;
        default :
          System.out.println("INCORRECT");
      }
    } while (!MenuAccount.option.equals("5"));
  }
}
