package main.iterator;

public class RadioStation {

    public static void main(String[] args) {
        BestOf70sSongs of70sSongs = new BestOf70sSongs();
        BestOf80sSongs of80sSongs = new BestOf80sSongs();
        BestOf90sSongs of90sSongs = new BestOf90sSongs();

        SongPlaylist playlist = new SongPlaylist(of70sSongs, of80sSongs, of90sSongs);
//        playlist.showPlayList();
        playlist.showPlayListWithIterator();
    }
}
