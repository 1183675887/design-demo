package SortDuck;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		/*我们需要一个鸭子数组；这些看起来不错*/
		Duck[] ducks = {
						new Duck("达菲", 8),
						new Duck("杜威", 2),
						new Duck("霍华德", 7),
						new Duck("路易", 2),
						new Duck("唐纳德", 10),
						new Duck("休伊", 2)
		 };

		System.out.println("排序之前:");
		display(ducks);
		System.out.println("-------------------------------------------------------------");

		/*调用Arrray类的静态方法sort(),然后将鸭子数组当做参数传入。*/
		Arrays.sort(ducks);
 
		System.out.println("\n排序之后:");
		display(ducks);
		System.out.println("-------------------------------------------------------------");
	}

	/*打印出鸭子的名字和体重*/
	public static void display(Duck[] ducks) {
		for (Duck d : ducks) {
			System.out.println(d);
		}
	}

}
