package SeasoningCls;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/*97页豆浆(调料)实现类(具体装饰者).*/
public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		    this.beverage = beverage;
	}

	public String getDescription() {
		  return beverage.getDescription() + ", 豆浆";
	}

	public double cost() {
//		System.out.println(beverage.cost() + getDescription());
//		System.out.println("xxx");
		  return .15 + beverage.cost();
	}

}
