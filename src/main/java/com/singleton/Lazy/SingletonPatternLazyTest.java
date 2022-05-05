package com.singleton.Lazy;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2021/12/19 4:40 下午
 */
public class SingletonPatternLazyTest {

    public static void main(String[] args) {
        Person person = new Person();
        Car car1 = person.travel();
        Car car2 = person.go2School();
        Car car3 = person.go2Party();

        System.out.println("(car1 == car2) = " + (car1 == car2));
        System.out.println("(car2 == car3) = " + (car2 == car3));
        //全部返回true，同一个地址

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
    }
}
