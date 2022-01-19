package SimpleFactory;

/**
 * @author yanzhihao
 * @Description:
 * @date 2021/12/19 4:21 下午
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing();
        // 小明骑摩托车去学校
        IVehicle motorcycle = GarageFactory.getVehicle("motorcycle");
        xiaoMing.goToSchool(motorcycle);
        // 小明开汽车去旅游
        IVehicle car = GarageFactory.getVehicle("car");
        xiaoMing.travel(car);
    }
}
