package StateCls;

import java.util.Random;
import Cls.GumballMachine;
import Interface.State;

/*404页：有25分钱状态实现类*/
public class HasQuarterState implements State {

	//首先我们增加一个随机数产生器,产生10%赢的机会
	Random randomWinner = new Random(System.currentTimeMillis());

	GumballMachine gumballMachine;

	/*当状态被实例化的时候,我们要传入GumballMachine的引用作为参数*/
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	/*这是一个对此状态不恰当的动作*/
	public void insertQuarter() {
		System.out.println("你不能再投入25分钱");
	}

	/*退出顾客的25分钱,并将状态转换到NoQuaterState状态*/
	public void ejectQuarter() {
		System.out.println("退出25分钱");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	/*当曲柄被转动时,我们就调用它的setState方法,并传入SoldState对象作为参数,
	将机器的状态转换到SoldState对象可以通过getSoldState方法取得(每个状态都有一个getter方法)*/
	public void turnCrank() {
		System.out.println("你转动曲柄...");
		/*然后觉得这个顾客是否赢了
		* 如果赢了,而且有足够的糖果可以让他一次得到两颗的话,我们就进入WinnerState状态,否则,就进入SoldState状态(就跟平常一样)*/
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("糖果售罄");
    }
    
    public void refill() { }
 
	public String toString() {
		return "等待曲柄转动";
	}
}
