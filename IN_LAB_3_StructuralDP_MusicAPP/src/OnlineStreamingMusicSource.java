//OnlineStreamingMusicSource.java
public class OnlineStreamingMusicSource implements MusicSource {
    @Override
    public void play() {
       System.out.println("Playing music from online streaming service.");
    }
    
    @Override
    public void stop() {
       System.out.println("Stopping music from online streaming service.");
    }
    }
    