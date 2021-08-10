package Abstract;

import Interface.FlyBehavior;
import Interface.QuackBehavior;

/*18页鸭子抽象超类*/
public abstract class Duck {
    /*为行为接口类型声明两个引用变量，所有鸭子子类都继承它们*/
    //飞行
    public FlyBehavior flyBehavior;
    //叫
    public QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    //委托给行为类，飞行
    public void performFly() {
        flyBehavior.fly();
    }

    //委托给行为类，叫的方式
    public void performQuack() {
        quackBehavior.quack();
    }

    //游泳行为
    public void swim() {
        System.out.println("所有的鸭子漂浮，甚至是诱饵鸭");
    }

    //第20页：增加鸭子的设定方法
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
