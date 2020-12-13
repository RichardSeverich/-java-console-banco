package com.views;

import java.util.Scanner;

import com.containers.UserLogin;

/**
 * Class.
 *
 */
public final class Welcome {

  /**
  * Constructor.
  */
  private Welcome() {
  }

  /**
  * welcome.
  */
  public static void welcome() {
    System.out.println("");
    System.out.println("************************************************");
    System.out.println("WELCOME");
    System.out.println("LOGIN WITH " + UserLogin.userName);
    System.out.println("************************************************");
    System.out.println("PRESS ENTER TO CONTINUE");
    Scanner entradaTeclado = new Scanner(System.in);
    entradaTeclado.nextLine();
  }
}
