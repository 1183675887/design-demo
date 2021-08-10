package NewRemoteControl.Test;

import NewRemoteControl.CommandCls.*;
import NewRemoteControl.Control.RemoteControl;
import NewRemoteControl.Entity.Hottub;
import NewRemoteControl.Entity.Light;
import NewRemoteControl.Entity.Stereo;
import NewRemoteControl.Entity.TV;
import NewRemoteControl.Inteface.Command;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("客厅");

		TV tv = new TV("客厅");

		Stereo stereo = new Stereo("客厅");

		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- 推动宏---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- 推微距---");
		remoteControl.offButtonWasPushed(0);
	}

}
