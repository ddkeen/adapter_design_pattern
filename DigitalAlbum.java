
/**
 * Interface for a CD or any other type of digital album
 * These albums can play from the beggining of the album, play the next song, play the previous song, play the current song, pause, or stop
 * @author ddkeen
 */public interface DigitalAlbum {

    public String playFromBeginning();

    public String playSong(int num);

    public String prevSong();

    public String nextSong();

    public String stop();

    public String pause();

    
}
