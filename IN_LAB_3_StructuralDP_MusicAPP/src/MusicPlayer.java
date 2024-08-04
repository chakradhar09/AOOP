//MusicPlayer.java
public abstract class MusicPlayer {
    protected MusicSource musicSource;
   
    protected MusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }
   
    public abstract void playMusic();
    public abstract void stopMusic();
   }
