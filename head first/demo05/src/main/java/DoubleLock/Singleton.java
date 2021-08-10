package DoubleLock;

/*182页：双重检查加锁*/
public class Singleton {
/*这个即保证了安全，也有速度*/
	//volatile关键字确保：当uniqueInstance变量被初始化成Singleton实际时，多个线程正确地处理uniqueInstance变量。
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}

	public static Singleton getInstance() {
		//检查实例，如果不存在，就进入同步区块。
		if (uniqueInstance == null) {
			//注意，只有第一次才彻底执行这里的代码。
			synchronized (Singleton.class) {
				//进入区域块后，再检查一次。如果仍是null,才创建实例。
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
