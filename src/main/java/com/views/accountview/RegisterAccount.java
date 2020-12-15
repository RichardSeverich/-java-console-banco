package com.views.accountview;

import java.util.Scanner;

import com.containers.AccountList;
import com.containers.UserLogin;
import com.controllers.HandleRegister;
import com.models.accounts.Account;
import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class RegisterAccount {

  /**
  * Constructor.
  */
  private RegisterAccount() {
  }

  /**
  * register.
  */
  public static void register() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("             REGISTER ACCOUNT             ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER SALDO");
    Scanner entradaTeclado = new Scanner(System.in);
    Account account = new Account();
    account.saldo = entradaTeclado.nextLong();
    account.createdBy = UserLogin.userName;
    HandleRegister.action(AccountList.listAccount, account);
    System.out.println("REGISTERED");
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
