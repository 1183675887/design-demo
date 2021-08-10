package DuckObject.TurkeyCls;

import DuckObject.Interface.Turkey;

/*238页：火鸡的具体实现*/
public class WildTurkey implements Turkey {

	public void gobble() {
		System.out.println("咯咯");
	}
 
	public void fly() {
		System.out.println("我会飞，但是飞不远");
	}

}
