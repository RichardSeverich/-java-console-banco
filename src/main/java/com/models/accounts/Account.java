package com.models.accounts;

import java.util.UUID;

import com.models.IModel;

/**
 * Class.
 *
 */
public class Account extends IModel {
  public Long saldo;
  public EnumStatus status;
  public String createdBy;
  public String editedBy;

  /**
  * Constructor.
  */
  public Account() {
    uuid = UUID.randomUUID().toString();
    saldo = 0L;
    status = EnumStatus.NOT_ASSIGNED;
    createdBy = "micky";
  }

  /**
  * changeStatusAssigned.
  */
  public final void changeStatusAssigned() {
    status = EnumStatus.ASSIGNED;
  }

  /**
  * changeStatusNotAssigned.
  */
  public final void changeStatusNotAssigned() {
    status = EnumStatus.NOT_ASSIGNED;
  }

  /**
  * changeStatus.
  */
  public final void changeStatus() {
    status = status == EnumStatus.NOT_ASSIGNED
      ? EnumStatus.ASSIGNED
      : EnumStatus.NOT_ASSIGNED;
  }
}
