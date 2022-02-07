package com.FactoryMethod;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/19 11:07 上午
 */
public class Product2Factory implements IFactory {
    public IProduct createProduct() {
        return new Product2();
    }
}