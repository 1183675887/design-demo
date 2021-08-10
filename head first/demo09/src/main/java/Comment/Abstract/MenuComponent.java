package Comment.Abstract;

import java.util.*;

/*360页：实现菜单组件*/
public abstract class MenuComponent {

	/*我们把"组合"方法组织在一起,即新增,删除和取得菜单组件
	* 因为有些方法只对菜单项有意义,而有些则只对菜单有意义,模式实现是抛出UnsupportedOperationException异常。
	* 这样,如果菜单项或菜单不支持某种操作,他们就不需要做任何事情,直接继承默认实现就可以了*/
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	/*这些是"操作"方法;它们被菜单项使用,其他有一些也可用在菜单上,再过几页你就会在菜单代码中看到了*/
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator<MenuComponent> createIterator();

	/*这是一个"操作"方法,这个方式同时被菜单和菜单项所实现,但我们还是在这里提供了默认的操作*/
	public void print() {
		throw new UnsupportedOperationException();
	}

}
