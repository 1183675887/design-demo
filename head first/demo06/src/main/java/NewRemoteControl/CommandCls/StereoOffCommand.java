package NewRemoteControl.CommandCls;

import NewRemoteControl.Entity.Stereo;
import NewRemoteControl.Inteface.Command;

public class StereoOffCommand implements Command {

	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
	}

}
