/**
 * Interface for a Cassett and Analog Adapter classes
 * Analog types of devices can play, fast forward, rewind, pause, or stop and eject
 * @author ddkeen
 */
public interface AnalogAlbum {
    public String play();

    public String rewind();

    public String ffwd();

    public String pause();

    public String stopEject();
}