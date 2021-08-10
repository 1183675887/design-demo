package HomeTheatre.ComponentSystem;

/*剧院灯*/
public class TheaterLights {

	String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " 打开");
	}

	public void off() {
		System.out.println(description + " 关闭");
	}

	public void dim(int level) {
		System.out.println(description + " 变暗为 " + level  + "%");
	}

	public String toString() {
		return description;
	}

}
