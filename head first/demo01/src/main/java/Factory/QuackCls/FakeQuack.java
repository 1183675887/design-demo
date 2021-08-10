package Factory.QuackCls;

import Interface.QuackBehavior;

/*叫的行为实现类*/
public class FakeQuack implements QuackBehavior {

	public void quack() {
		System.out.println("夸克");
	}
}
