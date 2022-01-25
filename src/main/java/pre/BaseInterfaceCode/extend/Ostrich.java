package pre.BaseInterfaceCode.extend;

/**
 * @Description: 鸵鸟
 * @Author: yanzhihao
 * @Date: 2022/1/24 10:08 上午
 */
public class Ostrich implements Flyable{

    private final FlyAbility flyAbility = new FlyAbility();

    @Override
    public void fly() {
        flyAbility.fly();
    }
}
