package Factory.bulletinBoardCls;

import Factory.WeatherCls.WeatherData;
import Interface.DisplayElement;
import Interface.Observer;

/*59页预测布告板实现*/
public class ForecastDisplay implements Observer, DisplayElement {

	//当前气压
	private float currentPressure = 29.92f;
    //最后气压
	private float lastPressure;

	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/*执行update方法就会输出相应的display方法。其中update的3个参数正好代表了改变的3个变量*/
	public void update(float temperature, float humidity, float pressure) {

        lastPressure = currentPressure;

        currentPressure = pressure;

		  display();
	}

	public void display() {
		System.out.print("预测: ");
		if (currentPressure > lastPressure) {
			System.out.println("天气改善了！");
		} else if (currentPressure == lastPressure) {
			System.out.println("天气还是一样");
		} else if (currentPressure < lastPressure) {
			System.out.println("小心阴雨天气！");
		}
	}
}
