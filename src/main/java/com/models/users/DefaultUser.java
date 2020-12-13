package com.models.users;

import com.containers.UserList;

/**
 * Class.
 *
 */
public final class DefaultUser {

  /**
  * Constructor.
  */
  private DefaultUser() {
  }

  /**
  * defaultUser.
  */
  public static void defaultUser() {

    User user1 = new User();
    user1.userName = "micky";
    user1.password = "holaloko";
    UserList.listUsers.add(user1);

    User user2 = new User();
    user2.userName = "richard";
    user2.password = "richard";
    UserList.listUsers.add(user2);

    User user3 = new User();
    user3.userName = "charli";
    user3.password = "joao";
    UserList.listUsers.add(user3);

    User user4 = new User();
    user4.userName = "admin";
    user4.password = "admin123";
    UserList.listUsers.add(user4);

    User user5 = new User();
    user5.userName = "naruto";
    user5.password = "uzumaki";
    UserList.listUsers.add(user5);

    User user6 = new User();
    user6.userName = "sasuke";
    user6.password = "uchiha";
    UserList.listUsers.add(user6);

    User user7 = new User();
    user7.userName = "jiraya";
    user7.password = "erosennin";
    UserList.listUsers.add(user7);

    User user8 = new User();
    user8.userName = "gabriel";
    user8.password = "aguilar";
    UserList.listUsers.add(user8);

    User user9 = new User();
    user9.userName = "lorena";
    user9.password = "aguilar";
    UserList.listUsers.add(user9);

    User user10 = new User();
    user10.userName = "ragnar";
    user10.password = "12345";
    UserList.listUsers.add(user10);
  }
}
