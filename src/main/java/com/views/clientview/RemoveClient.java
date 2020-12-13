package com.views.clientview;

import java.util.Scanner;

import com.containers.ClientList;
import com.controllers.HandleRemove;
import com.models.clients.Client;
import com.utils.LimpiarPantalla;
import com.controllers.HandleFindById;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class RemoveClient {
  private static String idRemove;

  /**
  * Constructor.
  */
  private RemoveClient() {
  }

  /**
  * remove.
  */
  public static void remove() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("               REMOVE CLIENT               ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID CLIENT");
    Scanner entradaTeclado = new Scanner(System.in);
    idRemove = entradaTeclado.nextLine();
    Tuple<Client> tuple = HandleFindById.
        <Client>action(ClientList.listClient, idRemove);
    if (tuple != null) {
      HandleRemove.action(ClientList.listClient, tuple.index);
      System.out.println("REMOVED");
    } else {
      System.out.println("INVALID ID");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
