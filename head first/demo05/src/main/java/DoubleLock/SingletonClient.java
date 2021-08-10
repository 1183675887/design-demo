package DoubleLock;

/*182页：双重检查加锁实现类测试类*/
public class SingletonClient {

	public static void main(String[] args) {
		//创建锅炉实例
		Singleton singleton = Singleton.getInstance();
	}

}
