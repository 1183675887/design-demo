package Comment.IteratorCls;
 
import Comment.Abstract.MenuComponent;

import java.util.Iterator;

/*372页：空迭代器*/
public class NullIterator implements Iterator<MenuComponent> {

	/*当next方法被调用时,返回null*/
	public MenuComponent next() {
		return null;
	}

	/*最重要的,当hasNext方法被调用时,永远返回false*/
	public boolean hasNext() {
		return false;
	}

//	 /*空迭代器当然不支持remove*/
//	public void remove() {
//		throw new UnsupportedOperationException();
//	}

}
