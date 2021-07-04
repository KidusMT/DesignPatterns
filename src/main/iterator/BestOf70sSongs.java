package main.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BestOf70sSongs implements SongIterator {

    private ArrayList<Song> songs = new ArrayList<>();

    public BestOf70sSongs(){
        songs.add(new Song("Yihonal","Daniel Amdemikael", 1970));
        songs.add(new Song("Yihonal1","Lily Tilanhun", 1973));
        songs.add(new Song("Yihonal2","Bethelhem Wolde", 1978));
    }

    public void addSongs(Song song){
        songs.add(song);
    }

    public ArrayList<Song> getSongList(){
        return songs;
    }

    @Override
    public Iterator<Song> getSongs() {
        return songs.iterator();
    }
}
