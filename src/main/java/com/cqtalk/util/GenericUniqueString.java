package com.cqtalk.util;

import java.util.UUID;

public class GenericUniqueString {

    //生成随机字符串
    public static String genericString(){

        return UUID.randomUUID().toString().replaceAll("-","").substring(0,10);
    }

}
