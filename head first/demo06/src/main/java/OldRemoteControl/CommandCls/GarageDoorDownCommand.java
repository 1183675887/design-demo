package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.GarageDoor;
import OldRemoteControl.Inteface.Command;

public class GarageDoorDownCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

}
