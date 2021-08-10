package DuckObject.Test;

import DuckObject.Adapter.DroneAdapter;
import DuckObject.Adapter.TurkeyAdapter;
import DuckObject.DroneCls.SuperDrone;
import DuckObject.DuckCls.MallardDuck;
import DuckObject.Interface.Drone;
import DuckObject.Interface.Duck;
import DuckObject.Interface.Turkey;
import DuckObject.TurkeyCls.WildTurkey;

/*240页：测试火鸡适配器*/
public class DuckTestDrive {

	public static void main(String[] args) {

		/*先创建一个鸭子和一只火鸡*/
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		/*将火鸡包装进一个火鸡适配器中，使它看起来像是一只鸭子*/
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		/*测试这只火鸡，让它咯咯叫，让它飞行*/
		System.out.println("火鸡说...");
		turkey.gobble();
		turkey.fly();
		System.out.println("-------------------------------------------------------------");

		/*调用testDuck()方法来测试鸭子，这个方法需要传入一个鸭子对象*/
		System.out.println("\n鸭子说...");
		testDuck(duck);
		System.out.println("-------------------------------------------------------------");

		/*传入一个假装是鸭子的火鸡*/
		System.out.println("\n火鸡适配器说...");
		testDuck(turkeyAdapter);
		System.out.println("-------------------------------------------------------------");
		
		// Challenge
		Drone drone = new SuperDrone();
		Duck droneAdapter = new DroneAdapter(drone);
		testDuck(droneAdapter);
		System.out.println("-------------------------------------------------------------");
	}

	/*这个方法取得一只鸭子，并调用它的quack()和fly()方法*/
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
