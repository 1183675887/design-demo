package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Light;
import OldRemoteControl.Inteface.Command;

public class LivingroomLightOffCommand implements Command {

	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

}
