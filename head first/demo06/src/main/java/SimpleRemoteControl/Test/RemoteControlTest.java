package SimpleRemoteControl.Test;

import SimpleRemoteControl.CommandCls.GarageDoorOpenCommand;
import SimpleRemoteControl.CommandCls.LightOnCommand;
import SimpleRemoteControl.Control.SimpleRemoteControl;
import SimpleRemoteControl.Entity.GarageDoor;
import SimpleRemoteControl.Entity.Light;

/*204页与205页测试实例*/
//命令模式的客户
public class RemoteControlTest {

	public static void main(String[] args) {

		//遥控器就是调用者，会传入一个命令对象，可以用来发出请求。
		SimpleRemoteControl control = new SimpleRemoteControl();
		//现在创建了一个电灯对象，此对象也就是请求的接收者
		Light light = new Light();
		//这是205页新增的测试
		GarageDoor garageDoor = new GarageDoor();
		//在这里创建一个命令，然后将接收者传给它
		LightOnCommand lightOn = new LightOnCommand(light);
		//这是205页新增的测试
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		//把命令传给调用者
		control.setCommand(lightOn);
		//然后模拟按下按钮
		control.buttonWasPressed();
		System.out.println("-------------------------------------------------------------");
		/*这是205页新增的测试*/
		control.setCommand(garageOpen);
		control.buttonWasPressed();
		System.out.println("-------------------------------------------------------------");
    }
	
}
