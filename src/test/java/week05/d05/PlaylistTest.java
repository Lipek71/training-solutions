package week05.d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {


    @Test
    public void test1Playlist() {
        Song song1 = new Song("Első", 150, "Chaerlie");
        Song song2 = new Song("Második", 200, "Eminem");
        Song song3 = new Song("Harmadik", 250, "U2");
        Song song4 = new Song("Utolsó", 125, "Kispál");

        List<Song> songs = new ArrayList<Song>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);

        Playlist playlist = new Playlist(songs);

        assertEquals(2,playlist.findByLengthGreaterThan(2).size() );
    }
}