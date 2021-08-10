package OldRemoteControl.Entity;

/*电视*/
public class TV {

	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("开启电视");
	}

	public void off() {
		System.out.println("关闭电视");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println("频道已设置为VCR");
	}

}
