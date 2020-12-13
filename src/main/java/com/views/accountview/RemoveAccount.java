package com.views.accountview;

import java.util.Scanner;

import com.containers.AccountList;
import com.controllers.HandleRemove;
import com.models.accounts.Account;
import com.utils.LimpiarPantalla;
import com.controllers.HandleFindById;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class RemoveAccount {
  private static String idRemove;

  /**
  * Constructor.
  */
  private RemoveAccount() {
  }

  /**
  * remove.
  */
  public static void remove() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("              REMOVE ACCOUNT              ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID ACCOUNT");
    Scanner entradaTeclado = new Scanner(System.in);
    idRemove = entradaTeclado.nextLine();
    Tuple<Account> tuple = HandleFindById.
        <Account>action(AccountList.listAccount, idRemove);
    if (tuple != null) {
      HandleRemove.action(AccountList.listAccount, tuple.index);
      System.out.println("REMOVED");
    } else {
      System.out.println("INVALID ID");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
