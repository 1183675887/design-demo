package DrinkCls;

import Abstract.Beverage;

/*96页深焙咖啡(饮料)实现类(具体组件)*/
public class DarkRoast extends Beverage {

	public DarkRoast() {
		 description = "深焙咖啡";
	}
 
	public double cost() {
		  return .99;
	}

}

