package Factory.WeatherCls;

import Interface.Observer;
import Interface.Subject;

import java.util.ArrayList;
import java.util.List;

/*58页主题接口实现类(也就是被观察者)*/
public class WeatherData implements Subject {
    //ArrayList来记录观察者，此ArrayList是在构造器中建立的
    private List<Observer> observers;
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float pressure;

    //在这里创建数组
    public WeatherData() {
          observers = new ArrayList<Observer>();
    }

     //当注册观察者时，我们只需要把它加到ArrayList的后面即可
    public void registerObserver(Observer o) {
          observers.add(o);
    }

    //同样地,当观察者想取消注册,我们把它从ArrayList删除即可
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);             //获得当前对象的索引位置
         if (i >= 0) {
             observers.remove(i);
          }
    }

    //在这里，我们把状态告诉每一个观察者。因为观察者都实现了update(),所以我们知道如何通知它们
    public void notifyObservers() {
        for (Observer observer : observers) {                //遍历所有观察者
            observer.update(temperature, humidity, pressure);
        }
    }
    /*-----------------以上是Subject接口的实现-------------------------------------------*/

    //当从气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged() {
        notifyObservers();
    }

    //利用这个方法来测试布告板
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //get方法
    public float getTemperature() {
          return temperature;
    }

    public float getHumidity() {
          return humidity;
    }

    public float getPressure() {
          return pressure;
    }

}
