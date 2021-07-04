package main.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class BestOf90sSongs implements SongIterator {

    private Hashtable<Integer,Song> songsHt = new Hashtable<>();
    private int songKey = 3;
    public BestOf90sSongs(){
        songsHt.put(0, new Song("Yihonal","Daniel Amdemikael", 1990));
        songsHt.put(1, new Song("Yihonal1","Lily Tilanhun", 1993));
        songsHt.put(2, new Song("Yihonal2","Bethelhem Wolde", 1998));
    }

    public void addSongs(Song song){
        songsHt.put(songKey, song);
        songKey++;
    }


    public Hashtable<Integer, Song> getSongList(){
        return songsHt;
    }

    @Override
    public Iterator<Song> getSongs() {
        return songsHt.values().iterator();
    }
}
