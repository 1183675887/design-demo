package Factory.DuckCls;

import Abstract.Duck;
import Factory.FlyCls.FlyWithWings;
import Factory.QuackCls.Quack;

/*16页鸭子抽象实现类,野鸭*/
public class MallardDuck extends Duck {

    public MallardDuck() {
        //绿头鸭使用Quack类处理呱呱叫，所以当performQuack()被调用时，叫的职责被委托给Quack对象，而我们得到了真正的呱呱叫。
        quackBehavior = new Quack();
        //使用FlyWithWings作为其FlyBehavior类型
        flyBehavior = new FlyWithWings();
    }
    /*别忘了，因为MallardDuck继承Dock类，所以flyBehavior与quackBehavior实例变量。*/

    public void display() {
        System.out.println("我是真正的野鸭");
    }
}
