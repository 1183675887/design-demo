package BrewingMethod.Abstract;

/*292页：定义钩子*/
public abstract class CaffeineBeverageWithHook {
 
	public final void prepareRecipe() {
		//用水煮沸
		boilWater();
		//泡
		brew();
		//倒入杯子
		pourInCup();
		/*加上一个小小的条件语句，而该条件是否成立，是由一个具体方法customerWantsCondiments()决定的。
		* 如果顾客"相要"调料，只有这时我们才调用addCondiments()*/
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

    //泡
	public abstract void brew();
    //加配料
	public abstract void addCondiments();

	public void boilWater() {
		System.out.println("把水煮沸");
	}
 
	public void pourInCup() {
		System.out.println("倒进杯子");
	}

	/*我们在这里定义了一个方法，(通常)是空的缺省实现。这个方法只会返回true,不做别的事
	* 这就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做。*/
    public boolean customerWantsCondiments() {
		return true;
	}

}
