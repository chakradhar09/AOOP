abstract class MusicPlayerDecorator extends MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer.musicSource);
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    public void play() {
        decoratedMusicPlayer.play();
    }
}