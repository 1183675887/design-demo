package SortDuck;

/*302页：比较鸭子。请记住，我们需要让鸭子类实现Comparable接口，因为我们无法真的让鸭子数组去继承数组。*/
public class Duck implements Comparable<Duck> {

	//名字
	String name;
	//体重
	int weight;

	/*鸭子有名字和体重*/
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	/*尽量让这里简单：只打印出名字和体重*/
	public String toString() {
		return  "名字:" + name + " ,体重: " + weight;
	}

	/*这就是排序所要用的*/
	public int compareTo(Duck otherDuck) {
 
        /*我们在这里指的鸭子是如何比较的。
        如果这只鸭子的体重比另一只鸭子的体重轻，就返回-1；
        如果相等，就返回0
        如果这只鸭子的体重比另外一只鸭子的体重重，就返回1*/
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}

}
