// Copyright 2021 Tencent Inc. All rights reserved.
//
// 获取账单文件下载地址的对外API
//
// 为方便商户快速查询和核对账务信息，支持通过本接口获取离线账单的下载地址。
//
// API version: 2.1.4

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.billdownload.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** GetFundFlowBillRequest */
public class GetFundFlowBillRequest {
  /** 账单日期 说明：账单日期，格式yyyy-MM-DD，仅支持三个月内的账单下载申请。 */
  @SerializedName("bill_date")
  @Expose(serialize = false)
  private String billDate;
  /** 资金账户类型 说明：资金账户类型，不填默认是BASIC */
  @SerializedName("account_type")
  @Expose(serialize = false)
  private AccountType accountType;
  /** 压缩格式 说明：压缩格式，不填则以不压缩的方式返回数据流 */
  @SerializedName("tar_type")
  @Expose(serialize = false)
  private TarType tarType;

  public String getBillDate() {
    return billDate;
  }

  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public TarType getTarType() {
    return tarType;
  }

  public void setTarType(TarType tarType) {
    this.tarType = tarType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFundFlowBillRequest {\n");
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    tarType: ").append(toIndentedString(tarType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}