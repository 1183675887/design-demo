package Test;
import Factory.bulletinBoardCls.CurrentConditionsDisplay;
import Factory.bulletinBoardCls.ForecastDisplay;
import Factory.bulletinBoardCls.HeatIndexDisplay;
import Factory.bulletinBoardCls.StatisticsDisplay;
import Factory.WeatherCls.WeatherData;

/*60页测试程序*/
public class WeatherStation {

    public static void main(String[] args) {

        //首先建立一个WeatherData对象。也就是要创建观察者数组
        WeatherData weatherData = new WeatherData();

        /**建立三个布告板，并把WeatherData对象传给它们**/
        //状态布告板,在这里创建对象时，因为构造函数里面有注册方法,因此会将此布告板注册
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //统计布告板,在这里创建对象时，因为构造函数里面有注册方法,因此会将此布告板注册
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //预测布告板,在这里创建对象时，因为构造函数里面有注册方法,因此会将此布告板注册
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //酷热指数布告板,在这里创建对象时，因为构造函数里面有注册方法,因此会将此布告板注册
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        /*模拟新的气象测量*/
        //这个set方法会直接调用到已经注册了3个布告板,因此会调用3个布告板
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-------------------------------------------------------------");
        //这个set方法会直接调用到已经注册了3个布告板,因此会调用3个布告板
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("-------------------------------------------------------------");
        //这个set方法会直接调用到已经注册了3个布告板,因此会调用3个布告板
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("-------------------------------------------------------------");

//        weatherData.removeObserver(forecastDisplay);
//        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
