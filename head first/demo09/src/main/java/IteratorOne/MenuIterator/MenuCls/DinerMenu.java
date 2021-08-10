package IteratorOne.MenuIterator.MenuCls;

import IteratorOne.Cls.MenuItem;
import IteratorOne.MenuIterator.Interface.Iterator;
import IteratorOne.MenuIterator.Interface.Menu;
import IteratorOne.MenuIterator.IntertorCls.DinerMenuIterator;

/*327页：改写餐厅菜单*/
public class DinerMenu implements Menu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	/*构造器*/
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		/*我们不需要getMenuJtems方法,而且事实上,我们根本不想要这个方法,因为它会暴露我们内部的实现*/
		addItem("素食主义者 BLT",
			"（Fakin'）全麦培根莴苣和番茄", true, 2.99);
		addItem("BLT",
			"培根配生菜和番茄全麦", false, 2.99);
		addItem("今日例汤",
			"当天的汤，配以土豆沙拉", false, 3.29);
		addItem("热狗",
			"配酸菜，津津有味，洋葱的热狗，上面放着奶酪",
			false, 3.05);
		addItem("蒸蔬菜和糙米",
			"糙米蒸蔬菜", true, 3.99);
		addItem("意大利面条",
			"意大利面配意大利西红柿酱和一片酸面包",
			true, 3.89);
	}
  
	 public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("抱歉，菜单已满！ 无法将项目添加到菜单");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}

	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	/*这是一个createIterator方法,用来从菜单项数组创建一个DinerMenuIterator,并将它返回给客户。
	返回迭代器接口.客户不需要知道餐厅菜单是如何维护菜单项的,也不需要知道迭代器是如何实现的，客户只需直接使用这个迭代器遍历菜单项即可*/
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
		// To test Alternating menu items, comment out above line,
		// and uncomment the line below.
		//return new AlternatingDinerMenuIterator(menuItems);
	}
	// other menu methods here
}
