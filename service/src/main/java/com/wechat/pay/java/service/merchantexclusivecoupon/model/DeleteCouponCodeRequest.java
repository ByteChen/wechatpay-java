// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** DeleteCouponCodeRequest */
public class DeleteCouponCodeRequest {
  /** 批次号 说明：商家券批次号 */
  @SerializedName("stock_id")
  @Expose(serialize = false)
  private String stockId;
  /** 券code 说明：上传的自定义code */
  @SerializedName("coupon_code")
  @Expose(serialize = false)
  private String couponCode;
  /** 请求业务单据号 说明：商户删除code的凭据号，商户侧需保持唯一性 */
  @SerializedName("delete_request_no")
  @Expose(serialize = false)
  private String deleteRequestNo;

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public String getDeleteRequestNo() {
    return deleteRequestNo;
  }

  public void setDeleteRequestNo(String deleteRequestNo) {
    this.deleteRequestNo = deleteRequestNo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCouponCodeRequest {\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    deleteRequestNo: ").append(toIndentedString(deleteRequestNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
