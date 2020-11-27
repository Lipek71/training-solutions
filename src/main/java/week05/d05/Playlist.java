package week05.d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {
    List<Song> playlist;

    public Playlist(List<Song> playlist) {
        this.playlist = playlist;
    }

    public List<Song> findByLengthGreaterThan(int length) {
        List<Song> playlistGreaterThen = new ArrayList<Song>();
        for (Song song : playlist) {
            if (song.lengthInSeconds / 60 > length) {
                playlistGreaterThen.add(song);
            }
        }
        return playlistGreaterThen;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlist=" + playlist +
                '}';
    }

    public static void main(String[] args) {
        Song song1 = new Song("Első", 150, "Chaerlie");
        System.out.println(song1);
        Song song2 = new Song("Második", 200, "Eminem");
        Song song3 = new Song("Harmadik", 250, "U2");
        Song song4 = new Song("Utolsó", 125, "Kispál");

        List<Song> songs = new ArrayList<Song>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);

        System.out.println(songs);

        Playlist playlist = new Playlist(songs);
        System.out.println(playlist.findByLengthGreaterThan(2));


    }
}
