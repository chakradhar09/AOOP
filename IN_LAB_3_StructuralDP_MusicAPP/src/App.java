public class App {
    public static void main(String[] args) throws Exception {
        // Using Adapter Pattern to adapt different music sources
     MusicSource localFile = new LocalFileMusicSource();
     MusicSource onlineStreaming = new OnlineStreamingMusicSource();
     MusicSource radioStation = new RadioStationMusicSource();

     // Using Bridge Pattern to decouple music playback from music source
     MusicPlayer localFilePlayer = new AdvancedMusicPlayer(localFile);
     MusicPlayer onlineStreamingPlayer = new AdvancedMusicPlayer(onlineStreaming);
     MusicPlayer radioStationPlayer = new AdvancedMusicPlayer(radioStation);

     // Using Decorator Pattern to add additional features to music playback
     MusicPlayer equalizerPlayer = new EqualizerDecorator(localFilePlayer);
     MusicPlayer volumeControlPlayer = new VolumeControlDecorator(equalizerPlayer);

     // Play music with additional features
     volumeControlPlayer.playMusic();
     volumeControlPlayer.stopMusic();
    }
}
