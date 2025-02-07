package space;

import java.util.ArrayList;
import java.util.Objects;

public class Spacecraft {
    public String name;
    public String manufacturer;
    public ArrayList<Double> ratings;

    public Spacecraft(String name, String manufacturer, ArrayList<Double> ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = (ArrayList<Double>) ratings.clone();
    }

    public void addRating(double rating){
        this.ratings.add(rating);
    }

    public void removeRating(double rating){
        this.ratings.remove(rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, ratings);
    }

    @Override
    public String toString() {
        return "Spacecraft: "+name+", "+manufacturer+", "+ratings;
    }
}
