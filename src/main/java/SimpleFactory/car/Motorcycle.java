package SimpleFactory.car;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/19 2:14 下午
 */
public class Motorcycle implements IVehicle{
    @Override
    public void run() {
        System.out.println("摩托车去");
    }
}
