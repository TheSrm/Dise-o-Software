import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Definición de clase release
public class Release {
    private final String uuid;
     private int  ID;
    private String Artist;

    private String Title;

   private final Set <Track> Tracklist = new HashSet<>();

 //Constructores de os métodos, non sei se é correcto deixalos pese a que non se usen
    public Release(String uuid) {
        this.uuid=uuid;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTracklist(Track track ) {
        Tracklist.add(track);
    }


    public void setTitle(String Title) {
        this.Title = Title;
    }

    //Getters para los valores de cada clase

    public  Set<Track> getTracklist() {
        return Tracklist;
    }

    public String getRelease(){return uuid;}
    public int getID() {
        return ID;
    }

    public String getArtist() {
        return Artist;
    }

    public String getTitle() {
        return Title;
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false;}
        if (getClass()!=obj.getClass()) {
            return false;
        }
        Release t = (Release) obj;
        return Objects.equals(this.Tracklist, t.Tracklist);
    }
    public int hashCode() {
        return Objects.hash(Tracklist);
    }

    @Override
    public String toString() {
         return "Id de album: "+ID+1+", de "+Artist+" su titulo es: "+Title+ "y estas son sus canciones:"+Tracklist;
    }

    public void addTrack ( Track Track){
        setTracklist(Track);

    }
}
