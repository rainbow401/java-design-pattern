package SimpleFactory.car;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/19 2:12 下午
 */
public class Car implements IVehicle{
    @Override
    public void run() {
        System.out.println("开车去");
    }
}
