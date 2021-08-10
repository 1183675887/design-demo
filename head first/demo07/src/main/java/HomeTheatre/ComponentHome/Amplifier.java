package HomeTheatre.ComponentHome;

import HomeTheatre.ComponentSystem.StreamingPlayer;
import HomeTheatre.ComponentSystem.Tuner;

/*功放组件*/
public class Amplifier {
	String description;
	//调音器
	Tuner tuner;
	//流媒体播放器
	StreamingPlayer player;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setStereoSound() {
		System.out.println(description + " 立体声模式开启");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " 环绕声打开 (5 音频, 1 低音炮)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " 将音量设置为 " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " 将调音器设置为 " + player);
		this.tuner = tuner;
	}
  
	public void setStreamingPlayer(StreamingPlayer player) {
		System.out.println(description + " 将流媒体播放器设置为 " + player);
		this.player = player;
	}
 
	public String toString() {
		return description;
	}
}
