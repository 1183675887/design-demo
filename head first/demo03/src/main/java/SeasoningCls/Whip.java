package SeasoningCls;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/*97页奶泡(调料)实现类(具体装饰者).*/
public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 奶泡";
	}
 
	public double cost() {
//		System.out.println(beverage.cost() + getDescription());
//		System.out.println("xxx");
		return .10 + beverage.cost();
	}
}
