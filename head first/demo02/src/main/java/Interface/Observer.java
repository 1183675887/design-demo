package Interface;

/*57页观察者接口*/
public interface Observer {

    /*所有的观察者都必须实现update()方法,以实现观察者接口.在这里，我们按照Mary和Sue的想法把观测值传入观察者中。
    * 当气象观测值改变时,主题会把这些状态值当做方法的参数，传送给观察者*/
    public void update(float temp, float humidity, float pressure);

}
