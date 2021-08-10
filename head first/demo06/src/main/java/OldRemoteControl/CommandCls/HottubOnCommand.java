package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Hottub;
import OldRemoteControl.Inteface.Command;

public class HottubOnCommand implements Command {

	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}

}

