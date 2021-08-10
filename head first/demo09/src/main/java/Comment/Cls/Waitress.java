package Comment.Cls;

import Comment.Abstract.MenuComponent;

import java.util.Iterator;

/*364页：女招待的代码*/
public class Waitress {
	//现在我们只需要将最顶层的菜单组件交给她就可以了,最顶层菜单包括其他所有菜单,我们称之为allMenus
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	/*她只需要调用最顶层菜单的print方法,就可以打印整个菜单层次,包括所有菜单以及所有菜单项*/
	public void printMenu() {
		allMenus.print();
	}

	/*print Vegetain Menu方法取得allMenu's的组合并得到它的迭代器来作为我们的CompositeJterator*/
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();

		System.out.println("\n素食菜单\n----");
		while (iterator.hasNext()) {
			//遍历组合中内的每个元素。
			MenuComponent menuComponent = iterator.next();
			try {
				//调用每个元素的isVegetarian方法,如果为true,就调用它的print方法
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
				//只有菜单项的pring方法可以调用,绝对不能调用菜单(组合)的print方法
				//我们在菜单上实现了isVegetarian方法,让它永远抛出异常。
				//如果异常果真发生了,我们就捕获这个异常,然后继续遍历。
			} catch (UnsupportedOperationException e) {}
		}
	}

}
