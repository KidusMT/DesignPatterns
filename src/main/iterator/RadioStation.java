package main.iterator;

import java.util.ArrayList;
import java.util.List;

public class RadioStation {

    public static void main(String[] args) {
        BestOf70sSongs of70sSongs = new BestOf70sSongs();
        BestOf80sSongs of80sSongs = new BestOf80sSongs();
        BestOf90sSongs of90sSongs = new BestOf90sSongs();

        List<SongIterator> songIterators = new ArrayList<>();
        songIterators.add(of70sSongs);
        songIterators.add(of80sSongs);
        songIterators.add(of90sSongs);

//        SongPlaylist playlist = new SongPlaylist(of70sSongs, of80sSongs, of90sSongs);
        SongPlaylist playlist = new SongPlaylist(songIterators.iterator());
//        playlist.showPlayList();
        playlist.showPlayListWithIterator();
    }
}
