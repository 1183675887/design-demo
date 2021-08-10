package Comment.IteratorCls;

import Comment.Abstract.MenuComponent;

import java.util.*;

/*369页：组合迭代器*/
public class CompositeIterator implements Iterator<MenuComponent> {

	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	/*将我们要遍历的顶层组合的迭代器传入。我们把它抛进一个堆栈数据结构中*/
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	/*当客户想要取得下一个元素的时候,我们先调用hasNext方法来确定是否还有下一个。*/
	public MenuComponent next() {
		if (hasNext()) {
			//如果还有下一个元素,我们就从堆栈中取出目前的迭代器,然后取得它的下一个元素
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			//如果元素是一个菜单,我们有了另一个需要被包含进遍历中的组合,所以我们将它丢进堆栈中。不管是不是菜单，我们都返回该组件
			stack.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		//想要知道是否还有下一个元素,我们检查栈堆是否被清空,如果已经空了,就表示没有下一个元素了
		if (stack.empty()) {
			return false;
		} else {
			//否则,我们就从栈堆的顶层中取出迭代器,看看是否还有下一个元素.如果它没有元素,我们就将它弹出堆栈,然后递归地调用hasNext方法
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				//否则,表示还有下一个元素,我们返回true
				return true;
			}
		}
	}
	
	/*
	 *我们不支持删除,这里只有遍历
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


