package Factory.DuckCls;

import Abstract.Duck;
import Factory.FlyCls.FlyWithWings;
import Factory.QuackCls.Quack;

/*一个新的鸭子类型*/
public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("我是真正的红头鸭");
	}
}
