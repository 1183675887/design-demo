package Abstract;

/*95页星巴兹原始的饮料抽象类(抽象组件)，也就是被装饰者*/
public abstract class Beverage {

 	public String description = "未知饮料";

	//get方法在此实现
	public String getDescription() {
		   return description;
	  }

	//cost方法必须在子类中实现
	public abstract double cost();

}
