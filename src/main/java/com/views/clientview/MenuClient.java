package com.views.clientview;

/**
 * Class.
 *
 */
public final class MenuClient {
  protected static String option = "";

  /**
  * Constructor.
  */
  private MenuClient() {
  }

  /**
  * show.
  */
  public static void show() {
    System.out.println("=========================================");
    System.out.println("                  CLIENT                 ");
    System.out.println("=========================================");
    System.out.println("1: REGISTER");
    System.out.println("=========================================");
    System.out.println("2: SHOW ALL");
    System.out.println("=========================================");
    System.out.println("3: EDIT");
    System.out.println("=========================================");
    System.out.println("4: REMOVE");
    System.out.println("=========================================");
    System.out.println("5: RETURN TO MAIN MENU");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("");
    System.out.println("CHOOSE A OPTION");
  }
}
