package OldRemoteControl.Test;

import OldRemoteControl.CommandCls.*;
import OldRemoteControl.Control.RemoteControl;
import OldRemoteControl.Entity.CeilingFan;
import OldRemoteControl.Entity.GarageDoor;
import OldRemoteControl.Entity.Light;
import OldRemoteControl.Entity.Stereo;

/*212页测试类*/
public class RemoteLoader {
 
	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		/*将所有的装置创建在合适的位置*/
		//电灯
		Light livingRoomLight = new Light("客厅");
		Light kitchenLight = new Light("厨房");
		//吊扇
		CeilingFan ceilingFan= new CeilingFan("客厅");
		//车库门
		GarageDoor garageDoor = new GarageDoor("车库");
		//音响
		Stereo stereo = new Stereo("客厅");

		/*创建所有的电灯命令对象*/
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		/*创建吊扇的开与关命令*/
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		/*创建车库门的上与下命令*/
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		/*创建音响的开与关命令*/
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff = new StereoOffCommand(stereo);

		/*现在已经有了全部的命令，可以将它们加载到遥控器插槽中*/
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		//在这里使用toString方法，打印出每个遥控器的插槽和它被指定的命令
		System.out.println(remoteControl);

		/*现在逐步按下每个插槽的开与关按钮*/
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println("-------------------------------------------------------------");
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		System.out.println("-------------------------------------------------------------");
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		System.out.println("-------------------------------------------------------------");
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		System.out.println("-------------------------------------------------------------");
	}

}
