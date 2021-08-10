package Factory.bulletinBoardCls;

import Factory.WeatherCls.WeatherData;
import Interface.DisplayElement;
import Interface.Observer;

/*61页酷热指数布告板*/
public class HeatIndexDisplay implements Observer, DisplayElement {
	//酷热指数
	float heatIndex = 0.0f;

	private WeatherData weatherData;

	/*注册观察者*/
	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/*执行update方法就会输出相应的display方法。其中update的3个参数正好代表了改变的3个变量*/
	public void update(float temperature, float humidity, float pressure) {
		heatIndex = computeHeatIndex(temperature, humidity);          //获得酷热指数
		display();                                   //输出酷热指数
	}

	//酷热指数计算
	private float computeHeatIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
			+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
			+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
	}

	public void display() {
		  System.out.println("酷热指数为 " + heatIndex);
	}

}
