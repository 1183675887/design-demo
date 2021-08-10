package Test;

import Cls.GumballMachine;

/*414页：测试类*/
public class GumballMachineTestDrive {

	public static void main(String[] args) {

		//让糖果机一开始就装了5颗糖果
		GumballMachine gumballMachine = new GumballMachine(10);

		System.out.println(gumballMachine);
		System.out.println("-------------------------------------------------------------");

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		System.out.println("-------------------------------------------------------------");

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		System.out.println("-------------------------------------------------------------");

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		System.out.println("-------------------------------------------------------------");

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		System.out.println("-------------------------------------------------------------");

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		System.out.println("-------------------------------------------------------------");
	}

}
