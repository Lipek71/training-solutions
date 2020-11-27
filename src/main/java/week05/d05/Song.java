package week05.d05;

public class Song {
    String name;
    long lengthInSeconds;
    String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        if(name == null || name.isBlank() || artist == null || artist.isBlank()){
            throw new IllegalArgumentException("Song name or artist is invalid!");
        }
        if (lengthInSeconds < 1){
            throw new IllegalArgumentException("Song length is invalid!");
        }
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song name: " + name + ", Artist: " + artist + ", (song length: " + lengthInSeconds + " s)";
    }
}
