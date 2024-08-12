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