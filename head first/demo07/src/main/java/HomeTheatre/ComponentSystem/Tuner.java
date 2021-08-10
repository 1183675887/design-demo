package HomeTheatre.ComponentSystem;

import HomeTheatre.ComponentHome.Amplifier;

/*调音器*/
public class Tuner {

	String description;
	//功放组件
	Amplifier amplifier;
	double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " 打开");
	}

	public void off() {
		System.out.println(description + " 关闭");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " 将频率设置为 " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " 设置AM模式");
	}

	public void setFm() {
		System.out.println(description + " 设置FM模式");
	}

	public String toString() {
		return description;
	}
}
