package com.models.clients;

import com.containers.AccountList;
import com.containers.ClientList;
import com.models.accounts.Account;

/**
 * Class.
 *
 */
public final class DefaultClient {

  /**
  * Constructor.
  */
  private DefaultClient() {
  }

  /**
  * defaultClient.
  */
  public static void defaultClient() {
    Client client1 = new Client();
    client1.name = "orlando";
    client1.lastName = "veizaga";
    client1.createdBy = "micky";
    Account acount0 = AccountList.listAccount.get(0);
    acount0.changeStatus();
    client1.account.add(acount0);
    Account acount1 = AccountList.listAccount.get(1);
    acount1.changeStatus();
    client1.account.add(acount1);
    Account acount2 = AccountList.listAccount.get(2);
    acount2.changeStatus();
    client1.account.add(acount2);
    ClientList.listClient.add(client1);

    Client client2 = new Client();
    client2.name = "jose";
    client2.lastName = "arratia";
    client2.createdBy = "micky";
    Account acount3 = AccountList.listAccount.get(3);
    acount3.changeStatus();
    client2.account.add(acount3);
    Account acount4 = AccountList.listAccount.get(4);
    acount4.changeStatus();
    client2.account.add(acount4);
    ClientList.listClient.add(client2);

    Client client3 = new Client();
    client3.name = "marco antonio";
    client3.lastName = "soliz";
    client3.createdBy = "micky";
    Account acount5 = AccountList.listAccount.get(5);
    acount5.changeStatus();
    client3.account.add(acount5);
    ClientList.listClient.add(client3);

    Client client4 = new Client();
    client4.name = "erland";
    client4.lastName = "veizaga";
    client4.createdBy = "micky";
    ClientList.listClient.add(client4);

    Client client5 = new Client();
    client5.name = "oscar";
    client5.lastName = "mamani";
    client5.createdBy = "micky";
    ClientList.listClient.add(client5);

    Client client6 = new Client();
    client6.name = "rodrigo";
    client6.lastName = "veizaga";
    client6.createdBy = "micky";
    ClientList.listClient.add(client6);

    Client client7 = new Client();
    client7.name = "erick";
    client7.lastName = "pastrana";
    client7.createdBy = "micky";
    ClientList.listClient.add(client7);

    Client client8 = new Client();
    client8.name = "lucas";
    client8.lastName = "souza";
    client8.createdBy = "micky";
    ClientList.listClient.add(client8);

    Client client9 = new Client();
    client9.name = "gabriel";
    client9.lastName = "torrico";
    client9.createdBy = "micky";
    ClientList.listClient.add(client9);

    Client client10 = new Client();
    client10.name = "felipe";
    client10.lastName = "muzner";
    client10.createdBy = "micky";
    ClientList.listClient.add(client10);
  }
}
