package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Light;
import OldRemoteControl.Inteface.Command;

public class LivingroomLightOnCommand implements Command {

	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

}
