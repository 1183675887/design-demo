package NewRemoteControl.Entity;

/*吊扇*/
public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		speed = HIGH;
		System.out.println(location + " 吊扇高档");
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		speed = MEDIUM;
		System.out.println(location + " 吊扇中档");
	}

	public void low() {
		// turns the ceiling fan on to low
		speed = LOW;
		System.out.println(location + " 吊扇低档");
	}
 
	public void off() {
		// turns the ceiling fan off
		speed = OFF;
		System.out.println(location + " 关闭吊扇");
	}
 
	public int getSpeed() {
		return speed;
	}
}
