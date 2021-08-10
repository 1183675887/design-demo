package Chocolate;

/*175页：巧克力工厂*/
public class ChocolateBoiler {
/*这个会导致多次加入问题*/

	private static ChocolateBoiler uniqueInstance;

	//熔炉为空为true，不为空则是false
	private boolean empty;
	//熔炉没煮沸则是false,熔炉煮沸则是true
	private boolean boiled;

	//锅炉开始是空的
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	//这是静态的，这意味着它是一个类方法,所以可以在代码的任何地方调用
	public static ChocolateBoiler getInstance() {
		  if (uniqueInstance == null) {
			  System.out.println("创建独特的巧克力锅炉实例");
			  uniqueInstance = new ChocolateBoiler();
	    	 }
		System.out.println("巧克力锅炉的归还实例");
		return uniqueInstance;
	}

	//在锅炉内填入原料时，锅炉必须是空的。一旦填入原料，就把empty和boiled标志设置好
	/*这个fill方法可以调用多次，因此会在生产中多次加入原材料导致出问题*/
	public void fill() {
		 if (isEmpty()) {
			 empty = false;
			 boiled = false;
			 // 在锅炉内填满巧克力和牛奶的混合物
		   }
	}

	//煮混合物时,锅炉必须是满的,并且是没有煮过的.一旦煮沸后,就把builed标志设为true
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 将炉内物煮沸
			boiled = true;
		}
	}

	//锅炉排出时,必须是满的(不可以是空的)而且是煮过的.排出完毕后,把empty标志设置为true
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// 排出煮沸的巧克力和牛奶
			empty = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}



}
