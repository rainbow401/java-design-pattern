package com.simplefactory.car;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/19 2:15 下午
 */
public class XiaoMing {

    public void goToSchool(IVehicle iVehicle) {
        System.out.println("小明去学校");
        iVehicle.run();
    }

    public void travel(IVehicle vehicle) {
        System.out.println("小明去旅游");
        vehicle.run();
    }
}
