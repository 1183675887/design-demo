package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.CeilingFan;
import OldRemoteControl.Inteface.Command;

public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.off();
	}

}
