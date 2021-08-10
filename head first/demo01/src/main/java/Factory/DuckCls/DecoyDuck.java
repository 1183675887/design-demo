package Factory.DuckCls;

import Abstract.Duck;
import Factory.FlyCls.FlyNoWay;
import Factory.QuackCls.MuteQuack;

/*一个新的鸭子抽象实现类型，诱饵鸭*/
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		//我不会飞
		setFlyBehavior(new FlyNoWay());
		//安静
		setQuackBehavior(new MuteQuack());
	}

	public void display() {

		System.out.println("我是诱饵鸭子");
	}
}
