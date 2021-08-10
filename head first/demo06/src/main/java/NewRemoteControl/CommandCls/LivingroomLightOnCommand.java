package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.Light;
import NewRemoteControl.Inteface.Command;

public class LivingroomLightOnCommand implements Command {

	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}

}
