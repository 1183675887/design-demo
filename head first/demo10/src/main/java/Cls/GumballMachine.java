package Cls;

import Interface.State;
import StateCls.*;

/*403页：完整的糖果机类*/
public class GumballMachine {

	/*所有的状态都在这里*/
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	//实例变量state
	State state;
	//这个count实例变量记录机器内装有多少糖果——————开始机器是没有装糖果的
	int count = 0;

	/*构造器取得糖果的初始数目并把它存放在一个实例变量中*/
	public GumballMachine(int numberGumballs) {
		/*每一种状态也都创建一个状态实例*/
		soldOutState = new SoldOutState(this);
		System.out.println(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		/*如果超过0颗糖果,我们就把状态设为NoQuaterState*/
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		}
//		} else {
//			state = soldOutState;
//		}
	}

	/*现在这些动作变得更容易实现了。我们只是委托到当前状态*/
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	/*请注意,我们不需要再GumbalMachine中准备一个dispense的工作方法,因为这只是一个内部的动作;
	用户不可以在直接要求机器发放糖果。但我们是在状态对象的turnCrank方法调用dispense方法的*/
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	/*这个方法允许其他的对象(像我们的状态对象)将机器的状态转换为不同的状态*/
	public void setState(State state) {
		this.state = state;
	}

	/*这个机器提供了一个releaseBall的辅助方法来释放糖果,并将count实例变量的值减1*/
	public void releaseBall() {
		System.out.println("一个糖果滚出来了。");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	public int getCount() {
		return count;
	}
 
	public void refill(int count) {
		this.count += count;
		System.out.println("糖果机刚刚装满； 它的数量是： " + this.count);
		state.refill();
	}


	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n强大的糖果公司.");
		result.append("\n启用Java的站立式糖果2004模型");
		result.append("\n库存: " + count + " 糖果");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("机器是 " + state + "\n");
		return result.toString();
	}

}
