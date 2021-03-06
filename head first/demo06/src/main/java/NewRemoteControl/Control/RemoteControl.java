package NewRemoteControl.Control;

import NewRemoteControl.CommandCls.NoCommand;
import NewRemoteControl.Inteface.Command;

/*实现遥控器*/
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ 遥控器 -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[插槽 " + i + "] " + "  [开启]  " + onCommands[i].getClass().getName()
				+ "  [关闭]  " + offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[撤消] " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}

}
