public class MusicStreamingApp {
    public static void main(String[] args) {
        // Play a local file
        MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicPlayer player = new BasicMusicPlayer(localFile);
        player = new EqualizerDecorator(player);
        player = new VolumeControlDecorator(player);
        player.play();

        // Play an online stream
        MusicSource onlineStream = new OnlineStreamAdapter("http://streaming.url");
        player = new BasicMusicPlayer(onlineStream);
        player = new EqualizerDecorator(player);
        player = new VolumeControlDecorator(player);
        player.play();

        // Play a radio station
        MusicSource radioStation = new RadioStationAdapter("Radio One");
        player = new BasicMusicPlayer(radioStation);
        player = new EqualizerDecorator(player);
        player = new VolumeControlDecorator(player);
        player.play();
    }
}
