package com.simplefactory.car;

/**
 * @Author: yanzhihao
 * @Description: 车库
 * @Date: 2021/12/19 4:22 下午
 */
public class GarageFactory {
    public static IVehicle getVehicle(String type) {
        if ("car".equals(type)) {
            return new Car();
        } else if ("motorcycle".equals(type)) {
            return new Motorcycle();
        }
        throw new IllegalArgumentException("请输入车类型");
    }
}
