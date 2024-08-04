
//RadioStationMusicSource.java
public class RadioStationMusicSource implements MusicSource {
    @Override
    public void play() {
       System.out.println("Playing music from radio station.");
    }
    
    @Override
    public void stop() {
       System.out.println("Stopping music from radio station.");
    }
    }