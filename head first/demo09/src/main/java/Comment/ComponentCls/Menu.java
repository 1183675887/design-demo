package Comment.ComponentCls;

import Comment.Abstract.MenuComponent;
import Comment.IteratorCls.CompositeIterator;

import java.util.Iterator;
import java.util.ArrayList;

/*362页：实现菜单组合*/
public class Menu extends MenuComponent {
	Iterator<MenuComponent> iterator = null;
	//菜单可以有任意数目的孩子,这些孩子都必须属于MenuCommponent类型,我们使用内部的ArrayList记录它们
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

	/*这和我们之前的实现不一样,我们将给每个菜单一个名字和一个描述。以前,每个菜单的类名称就是此菜单的名字*/
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	/*我们在这里将菜单项和其他菜单加入到菜单中。因为菜单和菜单项都是MenuComponent,所以我们只需用一个方法就可以两者兼顾
	* 同样的道理,也可以删除或取得某个MenuComponent*/
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}

	/*这是用来取得名字和描述的getter方法,请注意,我们并未覆盖getPrice或isVegertation方法。
	* 因为这些方法对Menu来说并没有意义(虽然你可能认为isVegertation有意义)。
	* 如果有人试着在Menu上调用这些方法,就会得到UnsupportedOperationException异常*/
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}

	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}

	/*为了打印出菜单,我们打印菜单的名称和描述*/
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent =
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}
