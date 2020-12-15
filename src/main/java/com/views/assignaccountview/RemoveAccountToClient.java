package com.views.assignaccountview;

import java.util.Scanner;

import com.containers.ClientList;
import com.containers.AccountList;
import com.models.clients.Client;
import com.models.accounts.Account;
import com.utils.LimpiarPantalla;
import com.controllers.HandleFindById;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class RemoveAccountToClient {
  private static String idClient;
  private static String idAccount;

  /**
  * Constructor.
  */
  private RemoveAccountToClient() {
  }

  /**
  * Remove.
  */
  public static void remove() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("        REMOVE ACCOUNT TO CLIENT         ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID CLIENT");
    Scanner entradaTeclado = new Scanner(System.in);
    idClient = entradaTeclado.nextLine();
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID ACCOUNT");
    idAccount = entradaTeclado.nextLine();
    Tuple<Client> tupleClient = HandleFindById.
        <Client>action(ClientList.listClient, idClient);
    Tuple<Account> tupleAccount = HandleFindById.
        <Account>action(AccountList.listAccount, idAccount);
    Tuple<Account> tupleClientAccount = HandleFindById.
        <Account>action(tupleClient.element.account, idAccount);
    if (tupleClient != null && tupleAccount != null) {
      tupleClient.element.account.remove(tupleClientAccount.index);
      tupleAccount.element.changeStatus();
      System.out.println("REMOVED ACCOUNT TO CLIENT");
    } else {
      System.out.println("INVALID ID CLIENT OR ID ACCOUNT");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
