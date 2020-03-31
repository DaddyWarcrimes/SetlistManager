package setlist;

import java.util.ArrayList;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class SongSelector {
    private CatalogView view;
    private ArrayList<Song> SongList;
    public SongSelector(CatalogView v){
        view = v;
        SongList = view.getList().reviewSongList();

    }

    /**
     * Selects the next appropriate Song for a Setlist
     * @return Returns a Song if an appropriate one is found, or null if no appropriate Songs exist.
     */
    public Song nextSong(Song prev, int index){
        for (int i = 0; i < SongList.size(); i++ ){
            if (SongList.get(i) == null){
                continue;
            }
            if (SongList.get(i).isArchive()){
                SongList.remove(i);
            }
            if (index % 2 == 0){
                if (SongList.get(i).getKey().equals(prev.getKey())){
                    System.out.println("SONG SELECTOR rejected: '" + SongList.get(i).getTitle() + "', same key");
                }
                else{
                    Song ret = SongList.get(i);
                    SongList.remove(i);
                    return ret;
                }
            }
            else{
                double difference;
                if (prev.getTempo() > SongList.get(i).getTempo()){
                    difference = prev.getTempo() - SongList.get(i).getTempo();
                }
                else{
                    difference = SongList.get(i).getTempo() - prev.getTempo();
                }
                double ratio = difference / (double) prev.getTempo();
                if ( ratio > 0.1){
                    Song ret = SongList.get(i);
                    SongList.remove(i);
                    return ret;
                }
                else {
                    System.out.println("SONG SELECTOR rejected: '" + SongList.get(i).getTitle() + "', same tempo");
                }
            }
        }
        // No appropriate songs
        return null;
    }
}
