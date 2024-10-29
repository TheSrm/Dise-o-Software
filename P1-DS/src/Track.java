import java.util.Objects;

public record Track(String pos, String ID, String artista, String titulo, int duracion) {
    public Track{
        if (duracion<0) throw new IllegalArgumentException("La duración no puede ser negativa");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if(getClass()!=obj.getClass()) return false;
        Track t = (Track) obj;
        return Objects.equals(this.ID, t.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return titulo+", de "+artista+" dura "+duracion/60+":"+duracion%60+" y ocupa la posición "+pos;
    }
}
