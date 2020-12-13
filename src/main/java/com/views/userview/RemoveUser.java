package com.views.userview;

import java.util.Scanner;

import com.containers.UserList;
import com.controllers.HandleRemove;
import com.models.users.User;
import com.utils.LimpiarPantalla;
import com.controllers.HandleFindById;
import com.models.Tuple;

/**
 * Class.
 *
 */
public final class RemoveUser {
  private static String idRemove;

  /**
  * Constructor.
  */
  private RemoveUser() {
  }

  /**
  * remove.
  */
  public static void remove() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("               REMOVE USER               ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID USER");
    Scanner entradaTeclado = new Scanner(System.in);
    idRemove = entradaTeclado.nextLine();
    Tuple<User> tuple = HandleFindById.
        <User>action(UserList.listUsers, idRemove);
    if (tuple != null) {
      HandleRemove.action(UserList.listUsers, tuple.index);
      System.out.println("REMOVED");
    } else {
      System.out.println("INVALID ID");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
