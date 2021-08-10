package OldRemoteControl.Entity;

/*吊扇*/
public class CeilingFan {

	String location = "";
	int level;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;

 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		level = HIGH;
		System.out.println(location + " 吊扇高档");
	} 

	public void medium() {
		level = MEDIUM;
		System.out.println(location + " 吊扇中档");
	}

	public void low() {
		level = LOW;
		System.out.println(location + " 吊扇低档");
	}
 
	public void off() {

		System.out.println(location + " 吊扇关闭");
	}
 
	public int getSpeed() {
		return level;
	}

}
