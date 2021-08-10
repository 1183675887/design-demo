package BrewingMethod.Abstract;

/*283页：咖啡因饮料抽象类*/
public abstract class CaffeineBeverage {

	/*用同一个prepareRecipe()方法来处理茶和咖啡。被声明成final,是因为不希望子类覆盖这个方法！*/
	public final void prepareRecipe() {
		//用水煮沸
		boilWater();
		//泡
		brew();
		//导入杯子
		pourInCup();
		//加配料
		addCondiments();
	}

	/*因为咖啡和茶处理这些方法的做法不同，所以这两个方法必须被声明为抽象，剩余的东西留给子类去操心*/
	//泡
	public abstract void brew();
    //倒入杯中
	public abstract void addCondiments();

	/*以下两个方法就是正常的方法*/
	void boilWater() {
		System.out.println("把水煮沸");
	}
  
	void pourInCup() {
		System.out.println("倒进杯子");
	}

}
