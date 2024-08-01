package ADPDemo;
//Step 5: Use the AudioPlayer to play different types of audio formats. (AdapterPatternDemo.java)
public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlay audioPlayer = new AudioPlay();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	}

}
