package com.views.clientview;

import java.util.Scanner;

import com.containers.ClientList;
import com.containers.UserLogin;
import com.controllers.HandleEdit;
import com.controllers.HandleFindById;
import com.models.clients.Client;
import com.utils.LimpiarPantalla;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class EditClient {
  private static String idEdit;

  /**
  * Constructor.
  */
  private EditClient() {
  }

  /**
  * edit.
  */
  public static void edit() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("               EDIT CLIENT               ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID CLIENT");
    Scanner entradaTeclado = new Scanner(System.in);
    idEdit = entradaTeclado.nextLine();
    Tuple<Client> tuple = HandleFindById.
        <Client>action(ClientList.listClient, idEdit);
    if (tuple != null) {
      System.out.println("ENTER NAME");
      Client client = new Client();
      client.name = entradaTeclado.nextLine();
      System.out.println("ENTER LASTNAME");
      client.lastName = entradaTeclado.nextLine();
      tuple.element.name = client.name;
      tuple.element.lastName = client.lastName;
      tuple.element.editedBy = UserLogin.userName;
      HandleEdit.action(ClientList.listClient, tuple.element, tuple.index);
      System.out.println("EDITED");
    } else {
      System.out.println("INVALID ID");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
