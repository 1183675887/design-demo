package NewRemoteControl.Entity;

/*电视*/
public class TV {

	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " 打开电视");
	}

	public void off() {
		System.out.println(location + " 关闭电视");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println(location + " 电视频道设置为DVD ");
	}

}
