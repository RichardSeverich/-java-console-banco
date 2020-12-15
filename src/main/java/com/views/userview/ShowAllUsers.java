package com.views.userview;

import java.util.Scanner;

import com.models.users.User;
import com.utils.LimpiarPantalla;
import com.containers.UserList;

/**
 * Class.
 *
 */
public final class ShowAllUsers {

  /**
  * Constructor.
  */
  private ShowAllUsers() {
  }

  /**
  * showAll.
  */
  public static void showAll() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("              SHOW ALL USERS             ");
    System.out.println("=========================================");
    for (User user : UserList.listUsers) {
      System.out.println("*****                               *****");
      System.out.println("=========================================");
      System.out.println("                  USER                   ");
      System.out.println("=========================================");
      System.out.println("UUID: " + user.uuid);
      System.out.println("USERNAME: " + user.userName);
      System.out.println("USER PASSWORD: " + user.password);
      System.out.println("");
      System.out.println("=========================================");
    }
    System.out.println("PRESS ENTER TO CONTINUE");
    Scanner entradaTeclado = new Scanner(System.in);
    entradaTeclado.nextLine();
  }
}
