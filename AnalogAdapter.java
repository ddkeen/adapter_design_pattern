/**
 * Analog Adapter class that implements the Analog Album interface
 * Allows a non analog device such as a CD behave like a Cassett
 * @author ddkeen
 */
public class AnalogAdapter implements AnalogAlbum {

    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Uses the nextSong method in a digital album to act as the analog album's play method
     * @return String a message explaining the method called from the digital album class
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Uses the next prevSong method in a digital album to act as the analog album's rewind method
     * @return String a message explaining the method called from the digital album class
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Uses the nextSong method in a digital album to act as the analog album's ffwd method
     * @return String a message explaining the method called from the digital album class
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Uses the pause method in a digital album to act as the analog album's pause method
     * @return String a message explaining the method called from the digital album class
     */
    public String pause() {
        return album.pause();
    }

      /**
     * Uses the stop method in a digital album to act as the analog album's stopEject method
     * @return String a message explaining the method called from the digital album class
     */
    public String stopEject() {
        return album.stop();
    }

}