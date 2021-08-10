package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Stereo;
import OldRemoteControl.Inteface.Command;

public class StereoOffCommand implements Command {

	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

}
