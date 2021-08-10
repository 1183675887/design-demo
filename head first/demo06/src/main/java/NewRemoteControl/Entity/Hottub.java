package NewRemoteControl.Entity;

/*热水浴缸*/
public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void circulate() {
		if (on) {
			System.out.println("热水浴缸冒泡了！");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("热水浴缸在喷");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("热水浴缸喷射关闭");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("热水浴缸正在冒着热气 " + temperature + " 度数");
		}
		else {
			System.out.println("热水浴缸冷却至 " + temperature + " 度数");
		}
		this.temperature = temperature;
	}
}
