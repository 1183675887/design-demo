package SeasoningCls;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/*97页摩卡(调料)实现类(具体装饰者).*/
public class Mocha extends CondimentDecorator {
/*要让Mocha能够引用一个Beverage，做法如下
1.用一个实例变量记录饮料，也就是被装饰者。
2.想办法让被装饰者(饮料)被记录到实例变量中。这里的做法是:把饮料当做构造器的参数，再由构造器将此饮料记录在实例变量中。
* */
	Beverage beverage;

	public Mocha(Beverage beverage) {
		  this.beverage = beverage;
	  }

	/*我们希望叙述不只是描述饮料(例如"DarkRoast",而是完整地连调料都描述出来(例如:DarkRoast))。
	所以首先利用委托的做法，得到一个叙述。然后在其后加上附加的叙述(例如"Mocha")*/
	public String getDescription() {
		  return beverage.getDescription() + ", 摩卡";
	}
 
	public double cost() {
//		System.out.println(beverage.cost() + getDescription());
//		System.out.println("xxxx");
		 return .20 + beverage.cost();
	}

}
