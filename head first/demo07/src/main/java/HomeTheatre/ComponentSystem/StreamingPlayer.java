package HomeTheatre.ComponentSystem;

import HomeTheatre.ComponentHome.Amplifier;

/*流媒体播放器*/
public class StreamingPlayer {

	String description;
	int currentChapter;
	//功放组件
	Amplifier amplifier;
	String movie;
	
	public StreamingPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " 打开");
	}
 
	public void off() {
		System.out.println(description + " 关闭");
	}
 
	public void play(String movie) {
		this.movie = movie;
		currentChapter = 0;
		System.out.println(description + " 播放 \"" + movie + "\"");
	}

	public void play(int chapter) {
		if (movie == null) {
			System.out.println(description + " 无法播放章节 " + chapter + " no movie selected");
		} else {
			currentChapter = chapter;
			System.out.println(description + " 播放章节 " + currentChapter + " of \"" + movie + "\"");
		}
	}

	public void stop() {
		currentChapter = 0;
		System.out.println(description + " 停止 \"" + movie + "\"");
	}
 
	public void pause() {
		System.out.println(description + " 已暂停 \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		System.out.println(description + " 设置两声道音频");
	}
 
	public void setSurroundAudio() {
		System.out.println(description + " 设置环绕声");
	}
 
	public String toString() {
		return description;
	}

}
