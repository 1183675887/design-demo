package HomeTheatre.ComponentHome;

import HomeTheatre.ComponentHome.Amplifier;

/*CD播放器组件*/
public class CdPlayer {

	String description;
	int currentTrack;
	//功放组件
	Amplifier amplifier;
	String title;
	
	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " 打开");
	}
 
	public void off() {
		System.out.println(description + " 关闭");
	}

	public void eject() {
		title = null;
		System.out.println(description + " 弹出");
	}
 
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.println(description + " 播放 \"" + title + "\"");
	}

	public void play(int track) {
		if (title == null) {
			System.out.println(description + " 不能播放曲目 " + currentTrack +
					", no cd inserted");
		} else {
			currentTrack = track;
			System.out.println(description + " 播放曲目 " + currentTrack);
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " 停止");
	}
 
	public void pause() {
		System.out.println(description + " 已暂停 \"" + title + "\"");
	}
 
	public String toString() {
		return description;
	}
}
