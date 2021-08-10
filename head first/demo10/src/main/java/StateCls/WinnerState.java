package StateCls;

import Cls.GumballMachine;
import Interface.State;

/*413页：抽奖状态实现类*/
public class WinnerState implements State {

    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("请稍等，我们已经为您提供糖果");
	}
 
	public void ejectQuarter() {
		System.out.println("请稍等，我们已经为您提供糖果");
	}
 
	public void turnCrank() {
		System.out.println("再次转身不会让您有第二个！");
	}

	/*在这里释放两颗糖果,然后进入NoQuarterState或SoldOutState*/
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			//如果还有第二颗糖果,我们就把它释放出来
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("您是赢家！ 你的25分钱获得了两个糖果");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("糟糕，没有糖果了！");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public void refill() { }
	
	public String toString() {
		return "因为您是赢家！ 你的25分钱获得了两个糖果";
	}
}
