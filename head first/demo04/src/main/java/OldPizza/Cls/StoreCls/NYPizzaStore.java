package OldPizza.Cls.StoreCls;

import OldPizza.Abstract.Pizza;
import OldPizza.Abstract.PizzaStore;
import OldPizza.Cls.PizzaCls.NYStyleCheesePizza;
import OldPizza.Cls.PizzaCls.NYStyleClamPizza;
import OldPizza.Cls.PizzaCls.NYStylePepperoniPizza;
import OldPizza.Cls.PizzaCls.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
