package StateCls;

import Cls.GumballMachine;
import Interface.State;

/*405页：售出糖果状态实现类*/
public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /*不恰当的动作*/
	public void insertQuarter() {
		System.out.println("请稍等，我们已经在给您一个糖果");
	}
 
	public void ejectQuarter() {
		System.out.println("抱歉，您已经把曲柄拉了");
	}
 
	public void turnCrank() {
		System.out.println("两次转动曲柄不会让你获得多的糖果");
	}

	/*真正的工作在这里*/
	public void dispense() {
		//我们现在是在SoldState状态,也就是说顾客以及付钱了。所以我们首先需要机器发送糖果
		gumballMachine.releaseBall();
		/*我们问机器糖果的剩余数目是多少,然后将状态转化到NoQuarterState或者SoldQutState*/
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("槽糕,糖果出来了");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "分发糖果";
	}
}


