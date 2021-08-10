package Eager;

/*181页急切的创建实例*/
public class Singleton {
/*总是创建并使用单件实例，或者在创建和运行时方面的负担不太繁重*/

	/*在静态初始器中创建单件。这段代码保证了线程安全。
	* 利用这个做法，我们一来JVM在加载这个类时马上创建此唯一的单件实例。
	* JVM保证在任何线程访问uniqueInstance静态变量之前，一定先创建此实例*/
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		//已经有了
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "我是静态初始化的单例！";
	}

}
