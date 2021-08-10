package DrinkCls;

import Abstract.Beverage;

/*96页浓缩咖啡(饮料)实现类(具体组件)*/
public class Espresso extends Beverage {

	//构造器，记住description实例变量继承自Beverage
	public Espresso() {
		 description = "浓缩咖啡";
	}

	//计算Espresso的价格，不需要管调料的价格，直接返回Espresso的价格即可
	public double cost() {
		  return 1.99;
	}

}

