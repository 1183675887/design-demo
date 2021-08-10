package SimpleRemoteControl.CommandCls;

import SimpleRemoteControl.Entity.Light;
import SimpleRemoteControl.Inteface.Command;

/*203页：实现一个关闭电灯的命令(命令接口实现类)*/
public class LightOffCommand implements Command {

	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
