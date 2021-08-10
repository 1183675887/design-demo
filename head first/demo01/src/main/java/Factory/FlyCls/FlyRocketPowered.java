package Factory.FlyCls;

import Interface.FlyBehavior;

/*20页：利用火箭动力的飞行行为*/
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("我正在用火箭飞行！");
    }
}
