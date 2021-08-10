package SimpleRemoteControl.CommandCls;

import SimpleRemoteControl.Entity.GarageDoor;
import SimpleRemoteControl.Inteface.Command;

/*205页：实现一个打开车库门的命令(命令接口实现类)*/
public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		  this.garageDoor = garageDoor;
	 }

	public void execute() {
	 	 garageDoor.up();
	 }

}
