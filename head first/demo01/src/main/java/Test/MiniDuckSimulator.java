package Test;

import Abstract.Duck;
import Factory.DuckCls.MallardDuck;
import Factory.FlyCls.FlyRocketPowered;

/*测试代码*/
public class MiniDuckSimulator {

    //21页测试
    public static void main(String[] args) {
            //第19页测试
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();


        Duck model = new MallardDuck();
        //调用飞的行为
        model.performFly();
        System.out.println("-------------------------------------------------------------");
        //这会调用继承类的setter方法，把火箭动力飞行的行为设定到模型鸭中
        model.setFlyBehavior(new FlyRocketPowered());
        //如果成功了，就意味着模型鸭可以动态地改变它的飞行行为。如果把行为的实现绑死在鸭子类，也就无法做到这样了
        model.performFly();
    }
}
