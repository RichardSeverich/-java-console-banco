package com.views.accountview;

import java.util.Scanner;

import com.containers.AccountList;
import com.containers.UserLogin;
import com.controllers.HandleEdit;
import com.controllers.HandleFindById;
import com.models.accounts.Account;
import com.utils.LimpiarPantalla;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class EditAccount {
  private static String idEdit;

  /**
  * Constructor.
  */
  private EditAccount() {
  }

  /**
  * edit.
  */
  public static void edit() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("               EDIT ACCOUNT               ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID ACCOUNT");
    Scanner entradaTeclado = new Scanner(System.in);
    idEdit = entradaTeclado.nextLine();
    Tuple<Account> tuple = HandleFindById.
        <Account>action(AccountList.listAccount, idEdit);
    if (tuple != null) {
      System.out.println("ENTER SALDO");
      Account acount = new Account();
      acount.saldo = entradaTeclado.nextLong();
      tuple.element.saldo = acount.saldo;
      tuple.element.editedBy = UserLogin.userName;
      HandleEdit.action(AccountList.listAccount, tuple.element, tuple.index);
      System.out.println("EDITED");
    } else {
      System.out.println("INVALID ID");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
