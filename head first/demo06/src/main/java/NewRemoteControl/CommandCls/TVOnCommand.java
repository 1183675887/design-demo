package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.TV;
import NewRemoteControl.Inteface.Command;

public class TVOnCommand implements Command {

	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}

}
