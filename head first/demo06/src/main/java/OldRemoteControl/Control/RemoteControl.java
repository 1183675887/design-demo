package OldRemoteControl.Control;

import OldRemoteControl.CommandCls.NoCommand;
import OldRemoteControl.Inteface.Command;

/*210页：实现遥控器*/
public class RemoteControl {

	//这个时候，遥控器要处理7个开与关的命令，使用相应数组记录记录这些命令
	Command[] onCommands;
	Command[] offCommands;

	//在构造器中，只需要实例化并初始化这两个开与关的数组
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	//这个方法须有3个参数，分别是插槽的位置，开的命令，关的关的命令。这些命令将记录在开关数组中对应的插槽位置，以供稍后使用。
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	/*当按下开与关的按钮，硬件就会负责调用对象的方法。*/
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	//覆盖toString方法，打印出每个插槽和特对应的命令，
	public String toString() {

		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ 遥控器 -------\n");

		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[插槽 " + i + "] " + "  [开启]  " +onCommands[i].getClass().getName()
				+ "  [关闭]  " + offCommands[i].getClass().getName() + "\n");
		}

		return stringBuff.toString();
	}

}
