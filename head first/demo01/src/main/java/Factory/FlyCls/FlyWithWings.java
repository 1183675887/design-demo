package Factory.FlyCls;

import Interface.FlyBehavior;

/*18页：飞行行为的实现，给"真会"飞的鸭子用...*/
public class FlyWithWings implements FlyBehavior {

    public void fly() {
      System.out.println("我在飞！");
    }
}
