class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;
    private String filename;

    public LocalFileAdapter(String filename) {
        this.localFilePlayer = new LocalFilePlayer();
        this.filename = filename;
    }

    @Override
    public void play() {
        localFilePlayer.playLocalFile(filename);
    }
}

class OnlineStreamAdapter implements MusicSource {
    private OnlineStreamPlayer onlineStreamPlayer;
    private String url;

    public OnlineStreamAdapter(String url) {
        this.onlineStreamPlayer = new OnlineStreamPlayer();
        this.url = url;
    }

    @Override
    public void play() {
        onlineStreamPlayer.playStream(url);
    }
}

class RadioStationAdapter implements MusicSource {
    private RadioStationPlayer radioStationPlayer;
    private String station;

    public RadioStationAdapter(String station) {
        this.radioStationPlayer = new RadioStationPlayer();
        this.station = station;
    }

    @Override
    public void play() {
        radioStationPlayer.playRadioStation(station);
    }
}
