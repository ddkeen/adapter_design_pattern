import java.util.ArrayList;

/**
 * Cassett class that implements the AnalogAlbum interface
 *  Normal cassett with 5 songs
 * @author ddkeen
 */
public class Cassett implements AnalogAlbum {

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
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays the current song if not already at the end of a casett
     * @return String a message explaining this
     */
    public String play() {
        if(currentIndex > 5)
            return "At the end of the cassett you need to rewind";
        else {
            currentIndex++;
            return "Playing song " + (currentIndex) + ": " + songs.get(currentIndex-1);
        }
    }

    /**
     * Rewinds the cassett to a previous song if not already at the beginning of the cassett
     * @return String a message explaining this
     */
    public String rewind() {
        if(currentIndex < 1) 
            return "Fully Re-Wound";
        else {
            currentIndex--;
            return "Rewinding to song " + (currentIndex +1);
        }
    }

    /**
     * Fast Forwards the cassett to the next song if not already at the end of the cassett
     * @return String a message explaining this
     */
    public String ffwd() {
        if(currentIndex < 5) {
            currentIndex++;
            if(currentIndex == 4) {
                return "Forwarded to the end of the cassett";
            }
            else {
                return "Forwarding to song " + (currentIndex+1);
            }
        }
        else {
            return "At the end of the cassett you need to rewind";
        }
    }

    /**
     * Pauses the cassett
     * @return String a message explaining this
     */
    public String pause() {
        return "Pausing ...";
    }

    /**
     * stops the cassett and ejects it from its player
     * @return String a message explaining this
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }

    
}
