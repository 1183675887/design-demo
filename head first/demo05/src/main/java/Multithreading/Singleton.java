package Multithreading;

/*180页：处理多线程*/
public class Singleton {

/*多线程保证了安全，但是会产生速度的影响*/
	private static Singleton uniqueInstance;
 
	//其他有用的实例化的变量
	private Singleton() {}

	//使每个线程在进入这个方法之前，要先等候别的线程离开该方法。也就是说，不会有两个线程可以同时进入这个方法
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// 其他有用的方法
	public String getDescription() {
		return "我是线程安全的单例！";
	}
}
