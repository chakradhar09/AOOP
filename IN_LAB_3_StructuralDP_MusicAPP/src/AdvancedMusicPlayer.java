// AdvancedMusicPlayer.java
public class AdvancedMusicPlayer extends MusicPlayer {
    public AdvancedMusicPlayer(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        musicSource.play();
    }

    @Override
    public void stopMusic() {
        musicSource.stop();
    }
}