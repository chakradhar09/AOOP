// VolumeControlDecorator.java
public class VolumeControlDecorator extends MusicPlayerDecorator {
    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void playMusic() {
        decoratedMusicPlayer.playMusic();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume control settings applied.");
    }
}
