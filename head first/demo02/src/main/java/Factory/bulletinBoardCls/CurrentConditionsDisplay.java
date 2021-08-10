package Factory.bulletinBoardCls;

import Factory.WeatherCls.WeatherData;
import Interface.DisplayElement;
import Interface.Observer;

/*第五步：59页状态布告板实现*/
//实现了Observer接口,所以可以从WeatherData对象中获得改变
//实现了DisplayElement接口,因为我们的API规定所有的布告板都必须实现此接口
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    //温度
    private float temperature;
    //气压
    private float humidity;

    private WeatherData weatherData;

    //构造器需要weatherData对象(也就是主题)作为注册之用
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);       //注册
    }

    //当update被调用时，我们把温度和湿度保持起来，然后调用display()
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    //display()方法就只是把最近的温度和湿度显示出来
    public void display() {
        System.out.println("现在的情况: " + temperature + "F 度和 " + humidity + "% 湿度");
    }

}
