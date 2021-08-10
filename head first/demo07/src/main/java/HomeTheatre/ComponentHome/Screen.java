package HomeTheatre.ComponentHome;

/*自动屏幕组件*/
public class Screen {

	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " 往上走");
	}

	public void down() {
		System.out.println(description + " 往下走");
	}


	public String toString() {
		return description;
	}
}
