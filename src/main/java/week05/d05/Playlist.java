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

    }
