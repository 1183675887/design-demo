package HomeTheatre.Test;

import HomeTheatre.ComponentSystem.TheaterLights;
import HomeTheatre.ComponentHome.CdPlayer;
import HomeTheatre.ComponentHome.Projector;
import HomeTheatre.ComponentSystem.StreamingPlayer;
import HomeTheatre.ComponentSystem.Tuner;
import HomeTheatre.ComponentHome.*;
import HomeTheatre.SumHome.HomeTheaterFacade;

/*263页：观赏电影测试实例*/
public class HomeTheaterTestDrive {

	public static void main(String[] args) {

		Amplifier amp = new Amplifier("功放");
		Tuner tuner = new Tuner("AM/FM 调音器", amp);
		StreamingPlayer player = new StreamingPlayer("流媒体播放器", amp);
		CdPlayer cd = new CdPlayer("CD播放器", amp);
		Projector projector = new Projector("投影机", player);
		TheaterLights lights = new TheaterLights("剧院吸顶灯");
		Screen screen = new Screen("剧院屏幕");
		PopcornPopper popper = new PopcornPopper("爆米花");
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player,
						                                      projector, screen, lights, popper);
		homeTheater.watchMovie("电影“夺宝奇兵");
		homeTheater.endMovie();
	}

}
