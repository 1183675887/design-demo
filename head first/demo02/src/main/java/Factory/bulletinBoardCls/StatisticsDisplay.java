package Factory.bulletinBoardCls;

import Factory.WeatherCls.WeatherData;
import Interface.DisplayElement;
import Interface.Observer;

/*59页统计布告板实现*/
public class StatisticsDisplay implements Observer, DisplayElement {
	//最高温度
	private float maxTemp = 0.0f;
	//最低温度
	private float minTemp = 200;
	//总和温度
	private float tempSum= 0.0f;
	//记录温度总个数
	private int numReadings;
	//被观察者
	private WeatherData weatherData;

	/*注册观察者*/
	public StatisticsDisplay(WeatherData weatherData) {
		 this.weatherData = weatherData;
		 weatherData.registerObserver(this);
	}

	/*执行update方法就会输出相应的display方法。其中update的3个参数正好代表了改变的3个变量*/
	public void update(float temperature, float humidity, float pressure) {
		   tempSum += temperature;
		   numReadings++;

		  if (temperature > maxTemp) {
			  maxTemp = temperature;
		   }
		  if (temperature < minTemp) {
			  minTemp = temperature;
		   }
		     display();                     //输出温度
	}

	public void display() {
		System.out.println("平均/最高/最低温度 = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
