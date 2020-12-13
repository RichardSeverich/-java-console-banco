package com.views.userview;

import java.util.Scanner;

import com.containers.UserList;
import com.controllers.HandleRegister;
import com.models.users.User;
import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class RegisterUser {

  /**
  * Constructor.
  */
  private RegisterUser() {
  }

  /**
  * register.
  */
  public static void register() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("              REGISTER USER              ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER USERNAME");
    Scanner entradaTeclado = new Scanner(System.in);
    User user = new User();
    user.userName = entradaTeclado.nextLine();
    System.out.println("ENTER PASSWORD");
    user.password = entradaTeclado.nextLine();
    HandleRegister.action(UserList.listUsers, user);
    System.out.println("REGISTER");
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
