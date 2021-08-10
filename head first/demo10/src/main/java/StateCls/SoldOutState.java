package StateCls;

import Cls.GumballMachine;
import Interface.State;

/*406页：糖果售罄状态实现类*/
public class SoldOutState implements State {

    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


	public void insertQuarter() {
		System.out.println("你无法投入25分钱,因为机器售罄了");
	}

	public void ejectQuarter() {
		System.out.println("你无法退钱,因为你还没用投入25分钱");
	}

	public void turnCrank() {
		System.out.println("你转动曲柄，但是没用糖果了");
	}
 
	public void dispense() {
		System.out.println("没用糖果可分配了");
	}
	
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "卖光了";
	}
}
