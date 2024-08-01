package ADPDemo;
//Step 2: Create concrete classes implementing the AdvancedMediaPlayer interface (VlcPlayer.java & Mp4Player.java)
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		//do nothing

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);

	}

}
