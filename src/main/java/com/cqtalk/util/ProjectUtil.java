package com.cqtalk.util;

import java.util.UUID;

public class ProjectUtil {
    // 生成随机字符串
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
