package DuckObject.Test;

import DuckObject.Adapter.DuckAdapter;
import DuckObject.DuckCls.MallardDuck;
import DuckObject.Interface.Turkey;

public class TurkeyTestDrive {

	public static void main(String[] args) {

		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}

}
