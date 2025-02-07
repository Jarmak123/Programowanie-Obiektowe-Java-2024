package coffes;

import java.util.ArrayList;
import java.util.Objects;

public class CoffeBlend {
    public String name;
    public String origin;
    public ArrayList<String> flavorNotes;

    public CoffeBlend(String name, String origin, ArrayList<String> flavorNotes) {
        this.name = name;
        this.origin = origin;
        this.flavorNotes = new ArrayList<>(flavorNotes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<String> getFlavorNotes() {
        return flavorNotes;
    }

    public void setFlavorNotes(ArrayList<String> flavorNotes) {
        this.flavorNotes = new ArrayList<>(flavorNotes);
    }

    public void addNote(String note){
        this.flavorNotes.add(note);
    }

    public void removeNote(String note){
        this.flavorNotes.remove(note);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeBlend that = (CoffeBlend) o;
        return Objects.equals(name, that.name) && Objects.equals(origin, that.origin) && Objects.equals(flavorNotes, that.flavorNotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, origin, flavorNotes);
    }

    @Override
    public String toString() {
        return CoffeBlend.class.getSimpleName()+": "+name+", "+origin+", "+flavorNotes;
    }
}
