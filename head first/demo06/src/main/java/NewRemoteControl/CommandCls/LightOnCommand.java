package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.Light;
import NewRemoteControl.Inteface.Command;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}

}
