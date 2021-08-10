package IteratorOne.MenuIterator.IntertorCls;

import IteratorOne.Cls.MenuItem;
import IteratorOne.MenuIterator.Interface.Iterator;

/*326页：迭代器实现类*/
public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	//position记录当前数组遍历的位置
	int position = 0;

	/*构造器需要一个呗传入菜单项的数组当做参数*/
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	/*next方法返回数组内的下一项，并递增其位置*/
	public MenuItem next() {
		/*
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
		*/
		
		// or shorten to 
		return items[position++];
	}

	/*hasNext方法会检查我们是否已经取得数组内所有的元素。如果还有元素待遍历,则返回true*/
	public boolean hasNext() {
		/*
		//因为使用的是固定长度的维护数组，所以我们不但要检查是否超出了数组长度,也必须检查是否下一项是null，如果是null，就表示没有其他项的了
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
		*/
		// or shorten to
		return items.length > position;
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
					("You can't remove an item until you've done at least one next()");
		}
		if (items[position-1] != null) {
			for (int i = position-1; i < (items.length-1); i++) {
				items[i] = items[i+1];
			}
			items[items.length-1] = null;
		}
	}

}
