package com.views.loginview;

import java.util.Scanner;

import com.containers.UserLogin;
import com.security.ValidateUser;
import com.utils.LimpiarPantalla;
import com.views.Welcome;

/**
 * Class.
 *
 */
public final class MenuLogin {
  static String userName;
  static String password;

  /**
  * Constructor.
  */
  private MenuLogin() {
  }

  /**
  * show.
  */
  public static void show() {
    do {
      LimpiarPantalla.limpiar();
      System.out.println("=========================================");
      System.out.println("                LOGIN BANK               ");
      System.out.println("=========================================");
      System.out.println("Enter your UserName");
      Scanner entradaTeclado = new Scanner(System.in);
      userName = entradaTeclado.nextLine();
      System.out.println("=========================================");
      System.out.println("Enter Your Password");
      password = entradaTeclado.nextLine();
    } while (!ValidateUser.validate(userName, password));
    UserLogin.userName = userName;
    Welcome.welcome();
  }
}
