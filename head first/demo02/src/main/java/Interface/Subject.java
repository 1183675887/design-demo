package Interface;

import Interface.Observer;

/*57页主题接口*/
public interface Subject {

    //这需要一个观察者作为变量，该观察者是用来注册的
    public void registerObserver(Observer o);

    //这需要一个观察者作为变量，该观察者是用来删除的
    public void removeObserver(Observer o);

    //当主题状态发送改变时，这个方法会被调用，以通知所有的观察者
    public void notifyObservers();

}
