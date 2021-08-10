package Factory.DuckCls;

import Abstract.Duck;
import Factory.FlyCls.FlyNoWay;
import Interface.FlyBehavior;
import Interface.QuackBehavior;

/*一个新的鸭子类型*/
public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("吱");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("我是橡皮鸭");
	}
}
