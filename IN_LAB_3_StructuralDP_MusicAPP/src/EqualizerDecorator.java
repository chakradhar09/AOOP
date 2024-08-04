//EqualizerDecorator.java
public class EqualizerDecorator extends MusicPlayerDecorator {
    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }
   
    @Override
    public void playMusic() {
        decoratedMusicPlayer.playMusic();
        setEqualizer();
    }
   
    private void setEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
   }