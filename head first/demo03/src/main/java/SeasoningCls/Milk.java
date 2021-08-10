package SeasoningCls;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/*97页牛奶(调料)实现类(具体装饰者).*/
public class Milk extends CondimentDecorator {

    Beverage beverage;

	public Milk(Beverage beverage) {
	      this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 牛奶";
	}

	public double cost() {
//		System.out.println(beverage.cost() + getDescription());
//		System.out.println("xxxxxx");
		return .10 + beverage.cost();
	}

}
