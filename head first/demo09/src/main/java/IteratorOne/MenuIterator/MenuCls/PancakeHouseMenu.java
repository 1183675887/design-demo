package IteratorOne.MenuIterator.MenuCls;

import IteratorOne.Cls.MenuItem;
import IteratorOne.MenuIterator.IntertorCls.PancakeHouseMenuIterator;
import IteratorOne.MenuIterator.Interface.Iterator;
import IteratorOne.MenuIterator.Interface.Menu;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {

	List<MenuItem> menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K＆B的煎饼早餐",
			"煎饼配炒鸡蛋和烤面包",
			true,
			2.99);
 
		addItem("常规煎饼早餐",
			"煎饼配煎蛋，香肠",
			false,
			2.99);
 
		addItem("蓝莓煎饼",
			"用新鲜蓝莓制成的煎饼",
			true,
			3.49);
 
		addItem("威化饼",
			"华夫饼配蓝莓或草莓",
			true,
			3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public List<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	public String toString() {
		return "奥克维尔煎饼屋菜单";
	}
	// other menu methods here
}
