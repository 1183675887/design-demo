package OldRemoteControl.Entity;

/*车库门*/
public class GarageDoor {

	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " 车库门已经是打开的");
	}

	public void down() {
		System.out.println(location + "车库门已经是关闭的 ");
	}

	public void stop() {
		System.out.println(location + " 停止车库门");
	}

	public void lightOn() {
		System.out.println(location + " 打开车库门");
	}

	public void lightOff() {
		System.out.println(location + " 关闭车库门");
	}

}
