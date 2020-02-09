package setlist;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Song {
    private String Title;
    private String Composer;
    private String Key;
    private boolean Archive; // if true, song will not be considered for setlists
    private int Length; // song length in seconds
    private int Tempo; // in beats per minute
    private int Intro; // length of introduction in seconds
    private int Order; // for randomized sorting

    public Song() {
       Title = "";
       Composer = "";
       Key = "";
       Archive = FALSE;
       Length = 0;
       Tempo = 0;
       Intro = 0;
       Order = -1;
    }

    /**
     * @param title Title of the song.
     */
    public void setTitle(String title){
        this.Title = title;
    }

    /**
     * @return Title of the song
     */
    public String getTitle(){
        return this.Title;
    }

    /**
     * @param composer The song's composer
     */
    public void setComposer(String composer){
        this.Composer = composer;
    }

    /**
     * @return The song's composer
     */
    public String getComposer(){
        return this.Composer;
    }

    /**
     * @param key The song's key
     */
    public void setKey(String key) {
        this.Key = key;
    }

    /**
     * @return The song's key
     */
    public String getKey(){
        return this.Key;
    }

    /**
     * @return Returns true if archived
     */
    public boolean isArchive() {
        return this.Archive;
    }

    /**
     * @param archive Set TRUE to archive song
     */
    public void setArchive(boolean archive) {
        Archive = archive;
    }

    /**
     * Switches Archive marker to TRUE if FALSE, or FALSE if TRUE
     */
    public void toggleArchive(){
        if (this.Archive) {
            this.Archive = FALSE;
        }
        else if (this.Archive == FALSE){
            this.Archive = TRUE;
        }
    }

    /**
     * @param intro Length of introduction in seconds
     */
    public void setIntro(int intro) {
        this.Intro = intro;
    }

    /**
     * @return Returns intro length in seconds
     */
    public int getIntro(){
        return this.Intro;
    }

    /**
     * @param length Total length of song in seconds
     */
    public void setLength(int length) {
        this.Length = length;
    }

    /**
     * @return Returns total song length in seconds
     */
    public int getLength() {
        return this.Length;
    }

    /**
     * @return Returns whole minutes of the song
     */
    public int getLengthMin(){
        return (this.Length / 60);
    }

    /**
     * @return Returns remaining seconds of song. Use with getLengthMin for total song length
     */
    public int getLengthSec(){
        return (this.Length % 60);
    }

    /**
     * @param tempo Song tempo in BPM
     */
    public void setTempo(int tempo) {
        this.Tempo = tempo;
    }

    /**
     * @return Returns tempo in BPM
     */
    public int getTempo() {
        return this.Tempo;
    }

    /**
     * @param order Sets list order
     */
    public void setOrder(int order) {
        this.Order = order;
    }

    /**
     * @return Returns list order
     */
    public int getOrder() {
        return this.Order;
    }

    public void setOrderRandom(){
        System.out.println("Not implemented");
        //Should set order to a random number
    }

    @Override
    public String toString() {
        return "Song{" +
                "Title='" + Title + '\'' +
                ", Composer='" + Composer + '\'' +
                ", Key='" + Key + '\'' +
                ", Archive=" + Archive +
                ", Length=" + Length +
                ", Tempo=" + Tempo +
                ", Intro=" + Intro +
                ", Order=" + Order +
                '}';
    }
}