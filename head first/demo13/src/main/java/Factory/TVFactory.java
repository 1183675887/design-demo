package Factory;

import Abstract.TV;
import TVCls.LG;
import TVCls.Sony;

public class TVFactory {

	public TV getTV(String type) throws Exception {

		if (type.equals("LG")) {
			return new LG();
		} else if (type.equals("Sony")) {
			return new Sony();
		} else {
			throw new Exception("Invalid TV Type");
		}

	}

}