package com.views.clientview;

import java.util.Scanner;

import com.containers.ClientList;
import com.models.accounts.Account;
import com.models.clients.Client;
import com.utils.LimpiarPantalla;


/**
 * Class.
 *
 */
public final class ShowAllClients {

  /**
  * Constructor.
  */
  private ShowAllClients() {
  }

  /**
  * showAll.
  */
  public static void showAll() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("             SHOW ALL CLIENTS            ");
    System.out.println("=========================================");
    for (Client client : ClientList.listClient) {
      System.out.println("*****                               *****");
      System.out.println("=========================================");
      System.out.println("                CLIENT                   ");
      System.out.println("=========================================");
      System.out.println("UUID: " + client.uuid);
      System.out.println("NAME: " + client.name);
      System.out.println("LASTNAME: " + client.lastName);
      System.out.println("CREATED BY: " + client.createdBy);
      System.out.println("EDITED BY: " + client.editedBy);
      System.out.println("");
      System.out.println("=========================================");
      System.out.println("               ACCOUNTS                  ");
      for (Account account : client.account) {
        System.out.println("UUID: " + account.uuid);
        System.out.println("SALDO: " + account.saldo);
        System.out.println("STATUS: " + account.status);
        System.out.println("CREATED BY: " + account.createdBy);
        System.out.println("EDITED BY: " + account.editedBy);
        System.out.println("========================================");
      }
    }
    Scanner entradaTeclado = new Scanner(System.in);
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
