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