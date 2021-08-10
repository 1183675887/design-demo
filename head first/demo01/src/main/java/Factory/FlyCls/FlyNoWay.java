package Factory.FlyCls;

import Interface.FlyBehavior;

/*18页，飞行行为的实现，给"不会"飞的鸭子用*/
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("我不会飞");
    }
}
