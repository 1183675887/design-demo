package HomeTheatre.SumHome;

import HomeTheatre.ComponentSystem.TheaterLights;
import HomeTheatre.ComponentHome.CdPlayer;
import HomeTheatre.ComponentHome.Projector;
import HomeTheatre.ComponentSystem.StreamingPlayer;
import HomeTheatre.ComponentSystem.Tuner;
import HomeTheatre.ComponentHome.*;

/*261页：使用组合让外观能够访问子系统所有的组件*/
public class HomeTheaterFacade {
	/*这就是组合，我们会用到的子系统组件全部都在这里。*/
	//功放组件
	Amplifier amp;
	//调音器
	Tuner tuner;
	//流媒体播放器
	StreamingPlayer player;
	//CD播放器组件
	CdPlayer cd;
	//投影机组件
	Projector projector;
	//剧院灯
	TheaterLights lights;
	//自动屏幕组件
	Screen screen;
	//爆米花机组件
	PopcornPopper popper;

	/*外观将子系统中每一个组件的引用都传入到它的构造器中。然后外观把它们赋值给相应的实例变量。*/
	public HomeTheaterFacade(Amplifier amp, 
				 Tuner tuner, 
				 StreamingPlayer player, 
				 Projector projector, 
				 Screen screen,
				 TheaterLights lights,
				 PopcornPopper popper) {
 
		this.amp = amp;
		this.tuner = tuner;
		this.player = player;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}

	/*实现简化的接口。将子系统的组件整合成一个统一的接口了。
	* watchMovie()将我们之前手动进行的每项任务依次处理。请注意，每项任务都是委托子系统中相应处理的*/
	public void watchMovie(String movie) {
		System.out.println("准备看电影...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setStreamingPlayer(player);
		amp.setSurroundSound();
		amp.setVolume(5);
		player.on();
		player.play(movie);
	}
 

	/*endMovie()负责关闭一切。每项任务也都是委托子系统中合适的组件处理的。*/
	public void endMovie() {
		System.out.println("关闭电影院...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		player.stop();
		player.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("收听广播...");
		tuner.on();
		tuner.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("关闭调音器...");
		tuner.off();
		amp.off();
	}
}
