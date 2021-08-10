package HomeTheatre.ComponentHome;

import HomeTheatre.ComponentSystem.StreamingPlayer;

/*投影机组件*/
public class Projector {

	String description;
	//流媒体播放器
	StreamingPlayer player;
	
	public Projector(String description, StreamingPlayer player) {
		this.description = description;
		this.player = player;
	}
 
	public void on() {
		System.out.println(description + " 打开");
	}
 
	public void off() {
		System.out.println(description + " 关闭");
	}

	public void wideScreenMode() {
		System.out.println(description + " 在宽屏模式（16x9长宽比）下");
	}

	public void tvMode() {
		System.out.println(description + " 在电视模式下（4x3长宽比）");
	}
  
        public String toString() {
                return description;
        }

}
