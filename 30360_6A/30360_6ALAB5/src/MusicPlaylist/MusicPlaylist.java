package MusicPlaylist;

import java.util.LinkedList;

public class MusicPlaylist {
    private final LinkedList<String> musicPlaylist;

    public MusicPlaylist(){
        this.musicPlaylist = new LinkedList<>();
    }

    public boolean isEmpty(){
        return !musicPlaylist.isEmpty();
    }
    public boolean isSong(String song){
        return musicPlaylist.contains(song);
    }
    public int getIndex(String song){
        return musicPlaylist.indexOf(song);
    }
    public int getSize(){
        return musicPlaylist.size();
    }

    public boolean addSong(String song){
        return musicPlaylist.offerFirst(song);
    }
    public boolean removeSong(String song){
        return musicPlaylist.remove(song);
    }
    public String moveSong(String song, int position){
        musicPlaylist.set(musicPlaylist.indexOf(song), musicPlaylist.get(position));
        return musicPlaylist.set(position, song);
    }
    public void playList(){
        for(String i: musicPlaylist)
            System.out.println((musicPlaylist.indexOf(i) + 1) + " " + i);
    }
}
