package main.iterator;

public class Song {

    private String title;
    private String singer;
    private int year;

    public Song(String title, String singer, int year) {
        this.title = title;
        this.singer = singer;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public int getYear() {
        return year;
    }
}
