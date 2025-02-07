package games;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public void addRatings(double rating){
        this.ratings=Arrays.copyOf(this.ratings,this.ratings.length+1);
        this.ratings[this.ratings.length-1]=rating;
    }

    public void removeRating(double rating){
        int index=-1;
        for(int i=0; i<ratings.length;i++){
            if(ratings[i]==rating)
            {
                index=i;
                break;
            }
        }
        double[] newRatings = new double[ratings.length-1];
        System.arraycopy(ratings,0,newRatings,0,index);
        System.arraycopy(ratings,index+1,newRatings,index,ratings.length-index-1);
        this.ratings=newRatings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }

    @Override
    public String toString() {
        return ComputerGame.class.getName()+": "+title+", "+producer+", "+ Arrays.toString(ratings);
    }
}
