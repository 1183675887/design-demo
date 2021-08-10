package IteratorOne.MenuIterator.Interface;

import IteratorOne.Cls.MenuItem;

/*326页：迭代器接口*/
public interface Iterator {

	/*hasNext方法会返回一个布尔值,让我们知道是否还有更多的元素*/
	boolean hasNext();
	/*而next方法返回下一个元素*/
	MenuItem next();

}
