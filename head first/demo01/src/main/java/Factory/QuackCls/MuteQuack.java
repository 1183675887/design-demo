package Factory.QuackCls;

import Interface.QuackBehavior;

/*19页叫的行为实现类*/
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< 安静 >>");
    }
}
