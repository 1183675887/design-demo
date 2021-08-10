package Interface;

/*401页状态类接口*/
public interface State {

	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();

	public void refill();
}
