package com.cqtalk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("账号状态类")
public enum StatusEnum {

    ZHENGCHANG("正常","ZHENGCHANG"),
    WEISHENGXIAIO("未生效","WEISHENGXIAO"),
    SHIXIAO("失效","SHIXIAO")
    ;

    @ApiModelProperty("状态名称")
    private String name;
    @ApiModelProperty("所处状态")
    private String status;
    StatusEnum(String name, String status) {
        this.name=name;
        this.status=status;
    }

}
