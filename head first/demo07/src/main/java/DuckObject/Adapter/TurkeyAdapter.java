package DuckObject.Adapter;

import DuckObject.Interface.Duck;
import DuckObject.Interface.Turkey;

/*239页：用火鸡来冒充鸭子*/
public class TurkeyAdapter implements Duck {

	Turkey turkey;

	//利用构造器取得要适配的对象引用
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	//这是调用火鸡的具体叫行为来实现鸭子的叫行为
	public void quack() {
		turkey.gobble();
	}

	//因为火鸡的飞行距离很短，不像鸭子可以长途飞行。要让鸭子的飞行和火鸡的行为能够对应，必须连续五次调用火鸡的fly()方法来完成
	public void fly() {
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
