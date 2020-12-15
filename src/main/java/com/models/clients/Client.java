package com.models.clients;

import java.util.ArrayList;
import java.util.UUID;

import com.models.IModel;
import com.models.accounts.Account;

/**
 * Class.
 *
 */
public class Client extends IModel {
  public String name;
  public String lastName;
  public ArrayList<Account> account;
  public String createdBy;
  public String editedBy;

  /**
  * Constructor.
  */
  public Client() {
    uuid = UUID.randomUUID().toString();
    account = new ArrayList<>();
  }
}
