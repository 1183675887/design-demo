package OldRemoteControl.CommandCls;

import OldRemoteControl.Entity.Light;
import OldRemoteControl.Inteface.Command;

/*211页：实现命令。*/
public class LightOffCommand implements Command {

	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}

}
