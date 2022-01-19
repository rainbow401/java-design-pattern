package Singleton.hungry;

/**
 * @author yanzhihao
 * @Description: 懒汉式单例模式，启动即初始化单例对象
 * @date: 2021/12/19 2:45 下午
 */
public class Car {

    private static final Car car = new Car();

    public static Car getInstance() {

        return car;
    }

    private Car() {

    }

    public void run() {
        System.out.println("go go go ！！！");
    }
}
