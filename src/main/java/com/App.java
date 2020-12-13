package com;

import com.models.accounts.DefaultAccount;
import com.models.clients.DefaultClient;
import com.models.users.DefaultUser;
import com.views.SwitchPrincipal;
import com.views.loginview.MenuLogin;

/**
 * Class
 *
 */
public final class App {

  /**
  * Constructor.
  */
  private App() {
  }

  /**
  * @param args args.
  */
  public static void main(final String[] args) {
    DefaultUser.defaultUser();
    DefaultAccount.defaultAccount();
    DefaultClient.defaultClient();
    MenuLogin.show();
    SwitchPrincipal.switchShow();
  }
}
