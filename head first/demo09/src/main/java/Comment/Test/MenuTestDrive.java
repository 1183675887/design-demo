package Comment.Test;

import Comment.Abstract.MenuComponent;
import Comment.Cls.Waitress;
import Comment.ComponentCls.Menu;
import Comment.ComponentCls.MenuItem;

/*365页：测试实例*/
public class MenuTestDrive {

	public static void main(String args[]) {
		/*先创建所有的菜单对象*/
		MenuComponent pancakeHouseMenu = new Menu("煎饼屋菜单", "早餐");
		MenuComponent dinerMenu = new Menu("晚餐菜单", "午餐");
		MenuComponent cafeMenu = new Menu("咖啡菜单", "晚餐");
		MenuComponent dessertMenu = new Menu("甜品菜单", "当然有甜点！");
		MenuComponent coffeeMenu = new Menu("咖啡菜单", "搭配下午咖啡的东西");

		//我们需要一个最顶层的菜单,将它称为allMenus。
		MenuComponent allMenus = new Menu("所有菜单", "所有菜单组合");

		/*我们使用组合的add()方法，将每个菜单都加入到顶层菜单allMenus中*/
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		/*在这里加入菜单项*/
  
		pancakeHouseMenu.add(new MenuItem(
			"K＆B的煎饼早餐",
			"煎饼配炒鸡蛋和烤面包",
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"常规煎饼早餐",
			"煎饼配煎蛋，香肠",
			false,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"蓝莓煎饼",
			"用新鲜蓝莓和蓝莓糖浆制成的煎饼",
			true,
			3.49));
		pancakeHouseMenu.add(new MenuItem(
			"威化饼",
			"华夫饼配蓝莓或草莓",
			true,
			3.59));

		dinerMenu.add(new MenuItem(
			"素食BLT",
			"（Fakin'）全麦培根莴苣和番茄",
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"BLT",
			"培根配生菜和番茄全麦",
			false, 
			2.99));
		dinerMenu.add(new MenuItem(
			"今日例汤",
			"一碗当天的汤，配土豆沙拉",
			false, 
			3.29));
		dinerMenu.add(new MenuItem(
			"热狗",
			"配酸菜，津津有味，洋葱的热狗，上面放着奶酪",
			false, 
			3.05));
		dinerMenu.add(new MenuItem(
			"蒸蔬菜和糙米",
			"糙米蒸蔬菜",
			true, 
			3.99));
 
		dinerMenu.add(new MenuItem(
			"意大利面条",
			"意大利面配marinara酱和一片酸面包",
			true, 
			3.89));

		//然后我们也在菜单中加入另一个菜单。由于菜单和菜单项都是MenuComponent,所以菜单可以顺利地被加入
		dinerMenu.add(dessertMenu);

		/*在甜点菜单上加了苹果派*/
		dessertMenu.add(new MenuItem(
			"苹果派",
			"苹果馅饼加脆皮，配以香草冰淇淋",
			true,
			1.59));
  
		dessertMenu.add(new MenuItem(
			"起司蛋糕",
			"纽约奶油芝士蛋糕，配以巧克力全麦面包皮",
			true,
			1.99));
		dessertMenu.add(new MenuItem(
			"冰糕",
			"一勺覆盆子和一勺石灰",
			true,
			1.89));

		cafeMenu.add(new MenuItem(
			"素汉堡和炸薯条",
			"全麦面包，生菜，番茄和薯条上的素食汉堡",
			true, 
			3.99));
		cafeMenu.add(new MenuItem(
			"今日例汤",
			"一天的汤一杯，配以色拉",
			false, 
			3.69));
		cafeMenu.add(new MenuItem(
			"墨西哥卷饼",
			"大墨西哥卷饼，配整个斑豆，莎莎酱，鳄梨调味酱",
			true, 
			4.29));

		cafeMenu.add(coffeeMenu);

		coffeeMenu.add(new MenuItem(
			"咖啡蛋糕",
			"脆皮蛋糕上撒上肉桂和核桃",
			true,
			1.59));
		coffeeMenu.add(new MenuItem(
			"百吉饼",
			"口味包括芝麻，罂粟籽，肉桂葡萄干，南瓜",
			false,
			0.69));
		coffeeMenu.add(new MenuItem(
			"比斯科蒂",
			"三个杏仁或榛子饼干",
			true,
			0.89));

		//一旦我们将整个菜单层次钩子完毕,把它交给女招待,你会发现,女招待要将整个菜单打印出来,简直就是易如反掌
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printMenu();
	}

}
