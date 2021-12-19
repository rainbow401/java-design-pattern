package SingletonPattern.Lazy;

/**
 * @Description: 恶汉式单例模式，第一次使用对象时才初始化该单例对象
 * @Author: yanzhihao
 * @Date: 2021/12/19 4:32 下午
 */
public class Car {

    private static Car car2;

    /**
     * 线程安全增加 synchronized修饰
     */
    public static synchronized Car getInstance() {
        if (car2 == null) {
            System.out.println("第一次创建对象：买车了。。。");
            car2 = new Car();
        }

        return car2;
    }

    private Car() {

    }

    public void run(){
        System.out.println("走");
    }
}
