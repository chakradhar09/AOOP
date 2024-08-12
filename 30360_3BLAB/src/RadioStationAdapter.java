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