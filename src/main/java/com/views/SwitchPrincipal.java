package com.views;

import java.util.Scanner;

import com.utils.LimpiarPantalla;
import com.views.accountview.SwitchAccount;
import com.views.assignaccountview.SwitchAssignAcount;
import com.views.clientview.SwitchClient;
import com.views.userview.SwitchUser;

/**
 * Class.
 *
 */
public final class SwitchPrincipal {

  /**
  * Constructor.
  */
  private SwitchPrincipal() {
  }

  /**
  * switchShow.
  */
  public static void switchShow() {
    Scanner  entradaTeclado = new Scanner(System.in);
    //MenuPrincipal.option = entradaTeclado.nextLine();
    do {
      LimpiarPantalla.limpiar();
      MenuPrincipal.show();
      switch (MenuPrincipal.option = entradaTeclado.nextLine()) {
        case "1":
          SwitchUser.showSwitchUser();
          break;
        case "2":
          SwitchAccount.showSwitchAccount();
          break;
        case "3":
          SwitchClient.showSwitchClient();
          break;
        case "4":
          SwitchAssignAcount.show();
          break;
        case "5":
          GoodBye.bye();
          break;
        default:
          System.out.println("INCORRECT");
      }
    } while (!MenuPrincipal.option.equals("5"));
  }
}
