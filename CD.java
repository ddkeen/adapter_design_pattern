import java.util.ArrayList;

public class CD implements DigitalAlbum {

    private ArrayList<String> songs;

    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning() {
        currentIndex = 1;
        return "Playing song 1: " + songs.get(currentIndex-1);
        
    }

    public String playSong(int num) {
        if(num<6 && num>0) {
            currentIndex = num;
            return "Playing " + num + ": " + songs.get(num-1);
        }
        else {
            return "Not a valid song number";
        }
    }

    public String prevSong() {
        if(currentIndex > 0) {
            currentIndex--;
            return "Skipping back and playing: " + songs.get(currentIndex);
        }
        else {
            return "Already at the beggining of the CD";
        }

    }

    public String nextSong() {
        if(currentIndex < 4) {
            currentIndex++;
            return "Advancing to the next song and playing: " + songs.get(currentIndex);
        }
        else {
            currentIndex = 0;
            return "Playing: " + songs.get(currentIndex);
        }
    }

    public String stop() {
        currentIndex = 0;
        return "Stopping CD and ejecting";
    }

    public String pause() {
        return "Pausing ...";
    }

    
}
