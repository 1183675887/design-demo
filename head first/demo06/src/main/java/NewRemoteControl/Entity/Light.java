package NewRemoteControl.Entity;

/*电灯*/
public class Light {
	String location;
	int level;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		level = 100;
		System.out.println("打开灯");
	}

	public void off() {
		level = 0;
		System.out.println("关闭灯");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("光线变暗 " + level + "%");
		}
	}

	public int getLevel() {
		return level;
	}
}
