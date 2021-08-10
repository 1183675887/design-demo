package DrinkCls;

import Abstract.Beverage;

/*96页综合咖啡(饮料)实现类(具体组件)*/
public class HouseBlend extends Beverage {

	public HouseBlend() {
		  description = "综合咖啡";
	}

	//这是另一种饮料的花费
	public double cost() {
		 return .89;
	}

}

