package com.Builder;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 5:34 下午
 */
public class Test {
    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig
                .Builder()
                .setName("db connection pool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}
