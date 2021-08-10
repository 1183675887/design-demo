package DrinkCls;

import Abstract.Beverage;

/*96页低咖啡因咖啡(饮料)实现类(具体组件)*/
public class Decaf extends Beverage {

	public Decaf() {
		  description = "低咖啡因咖啡";
	}
 
	public double cost() {
		  return 1.05;
	}

}

