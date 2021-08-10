package Abstract;

/*95页调料抽象类(抽象装饰者)，也就是装饰者类*/
public abstract class CondimentDecorator extends Beverage {

//	   Beverage beverage;

	//所有的调料装饰者都必须实现getDescription()方法。
	public abstract String getDescription();

}
