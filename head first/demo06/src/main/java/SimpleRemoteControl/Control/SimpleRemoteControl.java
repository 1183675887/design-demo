package SimpleRemoteControl.Control;

import SimpleRemoteControl.Inteface.Command;

/*204页：使用命令对象*/
public class SimpleRemoteControl {
/*有一个遥控器，只有一个按钮和对应的插槽，可以控制一个装置*/

	//有一个插槽持有命令，而这个命令控制着一个装置
	Command command;
 
	public SimpleRemoteControl() {}

	//这个方法用来设置插槽控制的命令。
	public void setCommand(Command command) {
		this.command = command;
	}

	//当按下按钮时，这个方法就会被调用，使得当前命令衔接插槽，并调用它的execute方法
	public void buttonWasPressed() {
		command.execute();
	}

}
