package Eager;

/*181页急切的创建实例测试类*/
public class SingletonClient {

	public static void main(String[] args) {
		//创建锅炉实例
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}

}
