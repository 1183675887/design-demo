package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.CeilingFan;
import OldRemoteControl.Inteface.Command;

public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.high();
	}

}
