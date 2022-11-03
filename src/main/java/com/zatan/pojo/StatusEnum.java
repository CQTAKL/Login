package com.zatan.pojo;

public enum StatusEnum {

    ZHENGCHANG("正常","ZHENGCHANG"),
    WEISHENGXIAIO("未生效","WEISHENGXIAO"),
    SHIXIAO("失效","SHIXIAO")
    ;

    private String name;
    private String status;
    StatusEnum(String name, String status) {
        this.name=name;
        this.status=status;
    }

}
