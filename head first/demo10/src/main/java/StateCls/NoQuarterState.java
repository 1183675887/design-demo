package StateCls;

import Cls.GumballMachine;
import Interface.State;

/*401页：没有25分钱状态实现类*/
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    /*我们通过构造器得到糖果机的引用,然后将它记录在实例变量中*/
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /*如果有人投了25分钱,我们就能打印出一条消息,说我们接受了25分钱,然后改变机器的状态到HasQuattenState*/
	public void insertQuarter() {
		System.out.println("你投了25分钱");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	/*如果没给钱,就不能要求退钱*/
	public void ejectQuarter() {
		System.out.println("你没有投入25分钱");
	}

	/*如果没给钱,就不能要求退钱*/
	public void turnCrank() {
		System.out.println("你退钱,但是你没有投入25分钱");
	 }

	/*如果没给钱,就不能要求糖果*/
	public void dispense() {
		System.out.println("你首先需要支付25分钱");
	}


	public void refill() { }
 
	public String toString() {
		return "等待25分钱";
	}
}
