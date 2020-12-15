package com.views.accountview;

import com.models.accounts.Account;
import com.utils.LimpiarPantalla;

import java.util.Scanner;

import com.containers.AccountList;

/**
 * Class.
 *
 */
public final class ShowAllAccounts {

  /**
  * Constructor.
  */
  private ShowAllAccounts() {
  }

  /**
  * showAll.
  */
  public static void showAll() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("             SHOW ALL ACCOUNTS            ");
    System.out.println("=========================================");
    for (Account account : AccountList.listAccount) {
      System.out.println("*****                               *****");
      System.out.println("=========================================");
      System.out.println("                  ACCOUNT                ");
      System.out.println("=========================================");
      System.out.println("UUID: " + account.uuid);
      System.out.println("SALDO: " + account.saldo);
      System.out.println("STATUS: " + account.status);
      System.out.println("CREATED BY: " + account.createdBy);
      System.out.println("EDITED BY: " + account.editedBy);
      System.out.println("");
      System.out.println("=========================================");
    }
    Scanner entradaTeclado = new Scanner(System.in);
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
