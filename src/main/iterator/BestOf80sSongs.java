package main.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class BestOf80sSongs implements SongIterator {

    private Song[] songs = new Song[3];

    public BestOf80sSongs() {
        songs[0] = new Song("Yihonal", "Daniel Amdemikael", 1980);
        songs[1] = new Song("Yihonal1", "Lily Tilanhun", 1983);
        songs[2] = new Song("Yihonal2", "Bethelhem Wolde", 1988);
    }

    public void addSongs(Song song) {
        Song[] temp = songs;
        songs = new Song[songs.length + 1];
        System.arraycopy(temp, 0, songs, 0, temp.length);
        songs[temp.length]= song;
    }

    public Song[] getSongList(){
        return songs;
    }

    @Override
    public Iterator<Song> getSongs() {
        return Arrays.asList(songs).iterator();
    }
}
