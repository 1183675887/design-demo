package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.Hottub;
import NewRemoteControl.Inteface.Command;

public class HottubOffCommand implements Command {

	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}

	public void undo() {
		hottub.on();
	}

}
