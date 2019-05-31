package cn.adapter.pattern.simple;

public class AdapterPatternDemo {

	
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "along.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
		
	}

}
