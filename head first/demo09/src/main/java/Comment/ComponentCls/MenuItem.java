package Comment.ComponentCls;

import Comment.Abstract.MenuComponent;
import Comment.IteratorCls.NullIterator;

import java.util.Iterator;

/*361页：实现菜单项*/
public class MenuItem extends MenuComponent {

	String name;
	String description;
	boolean vegetarian;
	double price;

	/*构造器需要被传入名字,叙述等,并保持对它们的引用。这和我们旧的菜单项实现很像*/
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	/*这是我们的getter方法,和之前的一样*/
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}

	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

	/*这和之前的不一样,在MenuComponent类里我们覆盖了print()方法。
	对菜单项来说,此方法会打印出完整的菜单项条目,包括:名字,描述,价格以及是否为素食*/
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}

}
