package OldPizza.Abstract;

/*120页：给比萨到使用的框架*/
public abstract class PizzaStore {

	//现在把工厂对象移到这个方法中，在PizzaStore里,"工厂方法"现在是抽象的
	public abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
