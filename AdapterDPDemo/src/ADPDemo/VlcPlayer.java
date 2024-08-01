package ADPDemo;
//Step 2: Create concrete classes implementing the AdvancedMediaPlayer interface (VlcPlayer.java & Mp4Player.java)
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);	

	}

	@Override
	public void playMp4(String fileName) {
		// Do Nothing

	}

}
