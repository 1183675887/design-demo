package Test;

import Abstract.Beverage;
import DrinkCls.DarkRoast;
import DrinkCls.Espresso;
import DrinkCls.HouseBlend;
import SeasoningCls.Mocha;
import SeasoningCls.Soy;
import SeasoningCls.Whip;

/*第八步：测试代码*/
public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		/*定一杯浓缩咖啡(饮料)对象,不需要调料，打印出它的描述和价格*/
		Beverage beverage = new Espresso();

		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		System.out.println("-------------------------------------------------------------");
        /*制造出一个深焙咖啡(饮料)对象。用Macha装饰它。用第二个Mocha装饰它，用Whip装饰它*/
		Beverage beverage2 = new DarkRoast();

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		//摩卡(调料)
		beverage2 = new Mocha(beverage2);

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		//摩卡(调料)
		beverage2 = new Mocha(beverage2);

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		//奶泡(调料)
		beverage2 = new Whip(beverage2);

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		System.out.println("-------------------------------------------------------------");
		/*来一杯调料为豆浆,摩卡,奶泡的综合咖啡(饮料)对象*/
		Beverage beverage3 = new HouseBlend();

		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		//豆浆(调料)
		beverage3 = new Soy(beverage3);

		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		//摩卡(调料)
		beverage3 = new Mocha(beverage3);

		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		//奶泡(调料)
		beverage3 = new Whip(beverage3);

		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		System.out.println("-------------------------------------------------------------");
	}

	/*当我们介绍到"工厂"和"生成器"设计模式时，将有更好的方式建立被装饰对象。注意,关于"生产者模式"请参考本书附录a*/

}
