package com.views.clientview;

import java.util.Scanner;

import com.containers.ClientList;
import com.containers.UserLogin;
import com.controllers.HandleRegister;
import com.models.clients.Client;
import com.utils.LimpiarPantalla;

/**
 * Class.
 *
 */
public final class RegisterClient {

  /**
  * Constructor.
  */
  private RegisterClient() {
  }

  /**
  * register.
  */
  public static void register() {
    LimpiarPantalla.limpiar();
    System.out.println("=========================================");
    System.out.println("             REGISTER CLIENT             ");
    System.out.println("=========================================");
    System.out.println("");
    System.out.println("ENTER NAME");
    Scanner entradaTeclado = new Scanner(System.in);
    Client client = new Client();
    client.name = entradaTeclado.nextLine();
    System.out.println("ENTER LASTNAME");
    client.lastName = entradaTeclado.nextLine();
    client.createdBy = UserLogin.userName;
    HandleRegister.action(ClientList.listClient, client);
    System.out.println("REGISTERED");
    System.out.println("PRESS ENTER TO CONTINUE");
    entradaTeclado.nextLine();
  }
}
