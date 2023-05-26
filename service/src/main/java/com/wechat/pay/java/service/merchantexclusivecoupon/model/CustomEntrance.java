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

import com.google.gson.annotations.SerializedName;

/** CustomEntrance */
public class CustomEntrance {
  /**
   * 小程序入口 说明：需要小程序APPID、path、入口文案、引导文案。如果需要跳转小程序，APPID、path、入口文案为必填，引导文案非必填。 AppID要与归属商户号有M-A or
   * M-m-suba关系。
   * 注：请查看[绑定关系说明文档](https://pay.weixin.qq.com/wiki/doc/apiv3/open/pay/chapter5_2_2.shtml#part-7)
   */
  @SerializedName("mini_programs_info")
  private MiniAppInfo miniProgramsInfo;
  /**
   * 商户公众号AppID 说明：可配置商户公众号，从券详情可跳转至公众号，用户自定义字段。 校验规则：传入的AppID得是与调用方商户号（即请求头里面的商户号）有绑定关系的AppID 或
   * 传入的AppID得是归属商户号有绑定关系的AppID
   */
  @SerializedName("appid")
  private String appid;
  /**
   * 更多优惠入口；营销馆创建地址：https://pay.weixin.qq.com/index.php/xphp/cfav_market/hall#/pages/list/list
   * 说明：填写微信支付营销馆的馆ID，用户自定义字段。[营销馆](https://pay.weixin.qq.com/index.php/xphp/cfav_market/hall#/pages/list/list)需在商户平台创建。
   */
  @SerializedName("hall_id")
  private String hallId;
  /** 可用门店ID 说明：填写代金券可用门店ID */
  @SerializedName("store_id")
  private String storeId;
  /** code展示模式 说明：code展示模式 */
  @SerializedName("code_display_mode")
  private CodeDisplayMode codeDisplayMode;

  public MiniAppInfo getMiniProgramsInfo() {
    return miniProgramsInfo;
  }

  public void setMiniProgramsInfo(MiniAppInfo miniProgramsInfo) {
    this.miniProgramsInfo = miniProgramsInfo;
  }

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getHallId() {
    return hallId;
  }

  public void setHallId(String hallId) {
    this.hallId = hallId;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public CodeDisplayMode getCodeDisplayMode() {
    return codeDisplayMode;
  }

  public void setCodeDisplayMode(CodeDisplayMode codeDisplayMode) {
    this.codeDisplayMode = codeDisplayMode;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEntrance {\n");
    sb.append("    miniProgramsInfo: ").append(toIndentedString(miniProgramsInfo)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    hallId: ").append(toIndentedString(hallId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    codeDisplayMode: ").append(toIndentedString(codeDisplayMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
