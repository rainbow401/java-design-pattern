package Singleton.hungry;

/**
 * @author yanzhihao
 * ● 要求生成唯一序列号的环境；
 * ● 在整个项目中需要一个共享访问点或共享数据，例如一个 Web 页面上的计数
 * 器，可以不用把每次刷新都记录到数据库中，使用单例模式保持计数器的值，并确
 * 保是线程安全的；
 * ● 创建一个对象需要消耗的资源过多，如要访问 IO 和数据库等资源；
 * ● 需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式
 * @Date 2021/12/19 2:48 下午
 */
public class SingletonPatternHungryTest {

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
