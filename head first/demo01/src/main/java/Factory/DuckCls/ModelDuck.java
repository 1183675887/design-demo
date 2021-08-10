package Factory.DuckCls;

import Abstract.Duck;
import Factory.FlyCls.FlyNoWay;
import Factory.QuackCls.Quack;

/*20页:一个新的鸭子类型，模型鸭*/
public class ModelDuck extends Duck {

    public ModelDuck() {
        //一开始，我们的模型鸭是不会飞的
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("我是一个模型鸭");
    }
}
