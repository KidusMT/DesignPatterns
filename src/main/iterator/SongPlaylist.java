package main.iterator;

import java.util.Iterator;

public class SongPlaylist {

    //    private BestOf70sSongs bestOf70sSongs;
//    private BestOf80sSongs bestOf80sSongs;
//    private BestOf90sSongs bestOf90sSongs;
    private final SongIterator bestOf70sSongs;
    private final SongIterator bestOf80sSongs;
    private final SongIterator bestOf90sSongs;

    //    public SongPlaylist(BestOf70sSongs songs70, BestOf80sSongs songs80, BestOf90sSongs songs90) {
    public SongPlaylist(SongIterator songs70, SongIterator songs80, SongIterator songs90) {
        bestOf70sSongs = songs70;
        bestOf80sSongs = songs80;
        bestOf90sSongs = songs90;
    }

    // old way of writing without the design pattern
    public void showPlayList() {
//        System.out.println("\n70s Best Hits");
//        for (int i = 0; i < bestOf70sSongs.getSongList().size(); i++) {
//            Song song = bestOf70sSongs.getSongList().get(i);
//            System.out.printf("Title: %s\n", song.getTitle());
//            System.out.printf("Singer: %s\n", song.getSinger());
//            System.out.printf("Year: %s\n", song.getYear());
//        }
//
//        System.out.println("\n80s Best Hits");
//        for (int i = 0; i < bestOf80sSongs.getSongList().length; i++) {
//            Song song = bestOf80sSongs.getSongList()[i];
//            System.out.printf("Title: %s\n", song.getTitle());
//            System.out.printf("Singer: %s\n", song.getSinger());
//            System.out.printf("Year: %s\n", song.getYear());
//        }
//
//        System.out.println("\n90s Best Hits");
//        for (Song song : bestOf90sSongs.getSongList().values()) {
//            System.out.printf("Title: %s\n", song.getTitle());
//            System.out.printf("Singer: %s\n", song.getSinger());
//            System.out.printf("Year: %s\n", song.getYear());
//        }
    }

    // clean code with the iterator design pattern
    public void showPlayListWithIterator() {
        System.out.println("\n70s Best Hits");
        printSongs(bestOf70sSongs.getSongs());

        System.out.println("\n80s Best Hits");
        printSongs(bestOf80sSongs.getSongs());

        System.out.println("\n90s Best Hits");
        printSongs(bestOf90sSongs.getSongs());
    }

    public void printSongs(Iterator<Song> iterator) {
        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            System.out.printf("Title: %s\n", song.getTitle());
            System.out.printf("Singer: %s\n", song.getSinger());
            System.out.printf("Year: %s\n", song.getYear());
        }
    }
}
