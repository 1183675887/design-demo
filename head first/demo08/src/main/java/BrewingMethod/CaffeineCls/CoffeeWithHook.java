package BrewingMethod.CaffeineCls;

import BrewingMethod.Abstract.CaffeineBeverageWithHook;

import java.io.*;

/*293页：使用钩子*/
public class CoffeeWithHook extends CaffeineBeverageWithHook {
 
	public void brew() {
		System.out.println("用沸水冲泡咖啡");
	}
 
	public void addCondiments() {
		System.out.println("加糖和牛奶");
	}

	/*覆盖了这个钩子，提供了自己的功能*/
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
        /*让用户输入它他们对调料的决定。根据用户的输入，返回true或false。*/
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	/*这段代码询问用户是否想要奶和糖，通过命令行获取用户输入。*/
	private String getUserInput() {
		String answer = null;

		System.out.print("您想在咖啡中加牛奶和糖吗 (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("尝试读取答案的IO错误");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}

}
