package OldRemoteControl.Entity;

/*211页：音响*/
public class Stereo {

	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " 打开音响");
	}

	public void off() {
		System.out.println(location + " 关闭音响");
	}

	public void setCD() {
		System.out.println(location + " 立体声设置为CD输入");
	}

	public void setDVD() {
		System.out.println(location + " 立体声设置为DVD输入");
	}

	public void setRadio() {
		System.out.println(location + " 立体声设置为收音机输入");
	}

	public void setVolume(int volume) {

		System.out.println(location + " 立体声设置为 " + volume);
	}

}
