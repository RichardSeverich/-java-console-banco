/**
 * package.
 */
package com.views.userview;

import java.util.Scanner;

import com.containers.UserList;
import com.controllers.HandleEdit;
import com.controllers.HandleFindById;
import com.models.users.User;
import com.models.Tuple;
import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class EditUser {
  private static String idEdit;

  /**
  * Constructor.
  */
  private EditUser() {
  }

  /**
  * edit.
  */
  public static void edit() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("                EDIT USER                ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER ID USER");
    Scanner entradaTeclado = new Scanner(System.in);
    idEdit = entradaTeclado.nextLine();
    Tuple<User> tuple = HandleFindById.<User>action(UserList.listUsers, idEdit);
    if (tuple != null) {
      System.out.println("ENTER USERNAME");
      User user = new User();
      user.userName = entradaTeclado.nextLine();
      System.out.println("ENTER PASSWORD");
      user.password = entradaTeclado.nextLine();
      tuple.element.userName = user.userName;
      tuple.element.password = user.password;
      HandleEdit.action(UserList.listUsers, tuple.element, tuple.index);
      System.out.println("EDITED");
    } else {
      System.out.println("INVALID ID");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
