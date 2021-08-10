package BrewingMethod.Test;

import BrewingMethod.CaffeineCls.Coffee;
import BrewingMethod.CaffeineCls.CoffeeWithHook;
import BrewingMethod.CaffeineCls.Tea;
import BrewingMethod.CaffeineCls.TeaWithHook;

public class BeverageTestDrive {

	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();

		System.out.println("\n泡茶...");
		//这个方法调用模板流程
		tea.prepareRecipe();
		System.out.println("-------------------------------------------------------------");

		System.out.println("\n泡咖啡...");
		//这个方法调用模板流程
		coffee.prepareRecipe();
		System.out.println("-------------------------------------------------------------");

		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\n泡茶...");
		//这个方法调用模板流程
		teaHook.prepareRecipe();
		System.out.println("-------------------------------------------------------------");
 
		System.out.println("\n泡咖啡...");
		//这个方法调用模板流程
		coffeeHook.prepareRecipe();
		System.out.println("-------------------------------------------------------------");
	}

}
