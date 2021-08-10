package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Stereo;
import OldRemoteControl.Inteface.Command;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	//要实现这个请求，需要调用音响的三个方法：首先打开它，然后把它设置成播放CD，最后把音量调为11
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
