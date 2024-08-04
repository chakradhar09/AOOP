//MusicPlayerDecorator.java
public abstract class MusicPlayerDecorator extends MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;
   
    public MusicPlayerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer.musicSource);
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }
   
    @Override
    public void playMusic() {
        decoratedMusicPlayer.playMusic();
    }
   
    @Override
    public void stopMusic() {
        decoratedMusicPlayer.stopMusic();
    }
   }
