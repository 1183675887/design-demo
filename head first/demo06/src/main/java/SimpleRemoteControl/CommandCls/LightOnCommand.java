package SimpleRemoteControl.CommandCls;

import SimpleRemoteControl.Entity.Light;
import SimpleRemoteControl.Inteface.Command;

/*203页：实现一个打开电灯的命令(命令接口实现类)*/
public class LightOnCommand implements Command {

	Light light;

	//构造器传递入某个电灯，以便让这个命令控制，然后记录在实例变量中。一旦调用execute()，就由这个电灯对象成为接受者，负责接受请求。
	public LightOnCommand(Light light) {
		this.light = light;
	}

	//这个方法接受对象的on方法
	public void execute() {
		light.on();
	}

}
