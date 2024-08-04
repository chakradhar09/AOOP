//LocalFileMusicSource.java
public class LocalFileMusicSource implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing music from local file.");
    }
   
    @Override
    public void stop() {
        System.out.println("Stopping music from local file.");
    }
   }