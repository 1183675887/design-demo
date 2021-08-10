package OldRemoteControl.Entity;

/*电灯*/
public class Light {

	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " 打开电灯");
	}

	public void off() {
		System.out.println(location + " 关闭电灯");
	}

}
