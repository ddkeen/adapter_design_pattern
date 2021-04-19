import java.util.ArrayList;
/**
 * CD class that implemetns the DigitalAlbum interface
 * This CD has 5 songs
 * @author ddkeen
 */
public class CD implements DigitalAlbum {

    private ArrayList<String> songs;

    private int currentIndex;

    /**
     * Cassett Constructor that takes 5 song names and adds them to a newly initialized arraylist of strings
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays the CD from the begining
     * @return String a message of what song is being played
     */
    public String playFromBeginning() {
        currentIndex = 1;
        return "Playing song 1: " + songs.get(currentIndex-1);
        
    }
    /**
     * Plays the song indicated number in the parameter
     * @return String a message of what song is being played
     * @param num, the song number
     */
    public String playSong(int num) {
        if(num<6 && num>0) {
            currentIndex = num;
            return "Playing " + num + ": " + songs.get(num-1);
        }
        else {
            return "Not a valid song number";
        }
    }

    /**
     * Plays the previous song on the CD if not already at the start
     * @return String a message of what song is being played
     */
    public String prevSong() {
        if(currentIndex > 0) {
            currentIndex--;
            return "Skipping back and playing: " + songs.get(currentIndex-1);
        }
        else {
            return "Already at the beggining of the CD";
        }

    }

    /**
     * Plays the next song on the CD, if at the end it plays the first song
     * @return String a message of what song is being played
     */
    public String nextSong() {
        if(currentIndex < 5) {
            currentIndex++;
            return "Playing: " + (currentIndex) + ": " + songs.get(currentIndex-1);
        }
        else {
            currentIndex = 0;
            return "Playing: " + songs.get(currentIndex);
        }
    }

    /**
     * Stops the CD from playing and resets the song index
     * @return String a message explaining this
     */
    public String stop() {
        currentIndex = 0;
        return "Stopping CD and ejecting";
    }

      /**
     * Pauses the CD
     * @return String a message explaining this
     */
    public String pause() {
        return "Pausing ...";
    }

    
}
