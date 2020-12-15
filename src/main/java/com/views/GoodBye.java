package com.views;

import com.containers.UserLogin;

/**
 * Class.
 *
 */
public final class GoodBye {

  /**
  * Constructor.
  */
  private GoodBye() {
  }

  /**
  * bye.
  */
  public static void bye() {
    System.out.println("************************************************");
    System.out.println("BYE " + UserLogin.userName);
    System.out.println("THANKS FOR USING THIS PROGRAM");
    System.out.println("************************************************");
  }
}
