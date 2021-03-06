package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.TV;
import NewRemoteControl.Inteface.Command;

public class TVOffCommand implements Command {

	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}

}
