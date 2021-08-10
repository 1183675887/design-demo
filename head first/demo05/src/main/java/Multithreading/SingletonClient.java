package Multithreading;

/*180页：处理多线程测试类*/
public class SingletonClient {

	public static void main(String[] args) {
        //不会传回数据
		Singleton singleton = Singleton.getInstance();

		System.out.println(singleton.getDescription());
	}

}
