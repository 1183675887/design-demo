package IteratorOne.Cls;

import IteratorOne.MenuIterator.Interface.Iterator;
import IteratorOne.MenuIterator.Interface.Menu;

/*328页：女招待遍历*/
public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
//	Menu cafeMenu;

	/*在构造器中,女招待照顾两个菜单*/
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
//		this.cafeMenu = cafeMenu;
	}

	/*这个方法为每一个菜单各自创建一个迭代器*/
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
//		Iterator cafeIterator = cafeMenu.createIterator();
		//然后对每个迭代器调用重载的(overloaded) printMenu，将迭代器传入
		System.out.println("菜单\n----\n早餐");
		printMenu(pancakeIterator);
		System.out.println("\n午餐");
		printMenu(dinerIterator);
//		System.out.println("\nDINNER");
//		printMenu(cafeIterator);

	}

	/*这个重载的方法,使用迭代器，来遍历菜单项并打印出来*/
	private void printMenu(Iterator iterator) {
		//测试是否还有其他选项
		while (iterator.hasNext()) {
			//取得下一项
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

	/*其他方法*/
	public void printVegetarianMenu() {
		printVegetarianMenu(pancakeHouseMenu.createIterator());
		printVegetarianMenu(dinerMenu.createIterator());
//		printVegetarianMenu(cafeMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		if (isVegetarian(name, breakfastIterator)) {
			return true;
		}
		Iterator dinnerIterator = dinerMenu.createIterator();
		if (isVegetarian(name, dinnerIterator)) {
			return true;
		}
//		Iterator cafeIterator = cafeMenu.createIterator();
//		if (isVegetarian(name, cafeIterator)) {
//			return true;
//		}
		return false;
	}

	private void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}
