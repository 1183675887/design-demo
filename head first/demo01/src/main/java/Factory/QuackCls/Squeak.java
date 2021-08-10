package Factory.QuackCls;

import Interface.QuackBehavior;

/*19页叫的行为实现类*/
public class Squeak implements QuackBehavior {

    public void quack() {
        System.out.println("吱");
    }
}
