package Chocolate;

/*175页：巧克力工厂测试实例*/
public class ChocolateController {

	public static void main(String args[]) {

		//创建锅炉实例
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		//向锅炉加入原料
		boiler.fill();
		//煮混合物
		boiler.boil();
		//排出
		boiler.drain();

	}

}
