package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Light;
import OldRemoteControl.Inteface.Command;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

}
