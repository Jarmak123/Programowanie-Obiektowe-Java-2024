package games;

import java.util.Arrays;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = Arrays.copyOf(ratings, ratings.length);
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
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public void addRating(double rating) {
        ratings = Arrays.copyOf(ratings, ratings.length + 1);
        ratings[ratings.length - 1] = rating;
    }

    public void removeRating(double rating) {
        int index = -1;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == rating) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            double[] newRatings = new double[ratings.length - 1];
            System.arraycopy(ratings, 0, newRatings, 0, index);
            System.arraycopy(ratings, index + 1, newRatings, index, ratings.length - index - 1);
            ratings = newRatings;
        }
    }

    @Override
    public String toString() {
        return "ComputerGame [title=" + title + ", producer=" + producer + ", ratings=" + Arrays.toString(ratings) + "]";
    }
}
