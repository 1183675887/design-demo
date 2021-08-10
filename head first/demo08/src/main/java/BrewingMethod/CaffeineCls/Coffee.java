package BrewingMethod.CaffeineCls;

import BrewingMethod.Abstract.CaffeineBeverage;

/*283页：咖啡的冲泡法*/
public class Coffee extends CaffeineBeverage {

	/*咖啡需要定义brew()和addCondiments(),这两个抽象方法来自Beverage类*/
	public void brew() {
		System.out.println("用沸水冲泡咖啡");
	}

	public void addCondiments() {
		System.out.println("加糖和牛奶");
	}

}
