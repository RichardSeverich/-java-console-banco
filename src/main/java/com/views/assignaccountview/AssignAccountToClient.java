package com.views.assignaccountview;

import java.util.Scanner;

import com.containers.AccountList;
import com.containers.ClientList;
import com.containers.UserLogin;
import com.models.clients.Client;
import com.utils.LimpiarPantalla;
import com.models.accounts.Account;
import com.controllers.HandleFindById;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class AssignAccountToClient {
  private static String idClient;
  private static String idAccount;

  /**
  * Constructor.
  */
  private AssignAccountToClient() {
  }

  /**
  * Assign.
  */
  public static void assign() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("        ASSIGN ACCOUNT TO CLIENT         ");
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
    if (tupleClient != null && tupleAccount != null) {
      tupleClient.element.account.add(tupleAccount.element);
      tupleClient.element.createdBy = UserLogin.userName;
      tupleAccount.element.createdBy = UserLogin.userName;
      tupleAccount.element.changeStatus();
      System.out.println("ADDED ACOUNT TO CLIENT");
    } else {
      System.out.println("INVALID ID CLIENT OR ID ACCOUNT");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
