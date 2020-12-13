package com.models.users;

import java.util.UUID;

import com.models.IModel;

/**
 * Class.
 *
 */
public class User extends IModel {
  public String userName;
  public String password;

  /**
  * Constructor.
  */
  public User() {
    uuid = UUID.randomUUID().toString();
  }
}
