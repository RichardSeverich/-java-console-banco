package com.security;

import com.containers.UserList;
import com.models.users.User;

/**
 * Class.
 *
 */
public final class ValidateUser {

  /**
  * Constructor.
  */
  private ValidateUser() {
  }

  /**
  * @param userName userName.
  *  @param password password.
  *  @return boolean.
  */
  public static boolean validate(final String userName, final String password) {
    for (User user : UserList.listUsers) {
      if (user.userName.equals(userName) && user.password.equals(password)) {
        return true;
      }
    }
    return false;
  }
}
