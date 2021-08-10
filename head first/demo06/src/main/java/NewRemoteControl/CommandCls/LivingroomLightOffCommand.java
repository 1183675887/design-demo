package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.Light;
import NewRemoteControl.Inteface.Command;

public class LivingroomLightOffCommand implements Command {

	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
	public void undo() {
		light.on();
	}

}
