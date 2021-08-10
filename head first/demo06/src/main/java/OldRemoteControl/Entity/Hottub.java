package OldRemoteControl.Entity;

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

	public void bubblesOn() {
		if (on) {
			System.out.println("热水浴缸冒泡了！");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("热水浴缸不冒泡");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("打开热水浴缸");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("关闭热水浴缸");
		}
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void heat() {
		temperature = 105;
		System.out.println("热水浴缸正加热到105度高温");
	}

	public void cool() {
		temperature = 98;
		System.out.println("热水浴缸冷却至98度");
	}

}
