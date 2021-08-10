package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Hottub;
import OldRemoteControl.Inteface.Command;

public class HottubOffCommand implements Command {

	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}

}
