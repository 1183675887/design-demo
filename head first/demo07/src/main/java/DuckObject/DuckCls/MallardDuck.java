package DuckObject.DuckCls;

import DuckObject.Interface.Duck;

/*238页：绿头鸭是鸭子的子类*/
public class MallardDuck implements Duck {

	public void quack() {
		System.out.println("嘎嘎");
	}
 
	public void fly() {
		System.out.println("我会飞");
	}

}
