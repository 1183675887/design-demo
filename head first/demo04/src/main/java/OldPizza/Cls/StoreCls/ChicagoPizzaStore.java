package OldPizza.Cls.StoreCls;

import OldPizza.Abstract.Pizza;
import OldPizza.Abstract.PizzaStore;
import OldPizza.Cls.PizzaCls.ChicagoStyleCheesePizza;
import OldPizza.Cls.PizzaCls.ChicagoStyleClamPizza;
import OldPizza.Cls.PizzaCls.ChicagoStylePepperoniPizza;
import OldPizza.Cls.PizzaCls.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
