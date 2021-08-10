package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.GarageDoor;
import OldRemoteControl.Inteface.Command;

public class GarageDoorUpCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

}
