package SimpleRemoteControl.Entity;

/*对象*/
public class GarageDoor {

	public GarageDoor() {
	}

	public void up() {
		System.out.println("打开车库门");
	}

	public void down() {
		System.out.println("关闭车库门");
	}

	public void stop() {
		System.out.println("停止车库门");
	}

	public void lightOn() {
		System.out.println("打开车库灯");
	}

	public void lightOff() {
		System.out.println("关闭车库灯");
	}

}
