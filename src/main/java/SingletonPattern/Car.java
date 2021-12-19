package SingletonPattern;

/**
 * @author yanzhihao
 * @Description:
 * @date 2021/12/19 2:45 下午
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
