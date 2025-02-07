package literature;

import java.util.Arrays;
import java.util.Objects;

public class Novel {
    public String title;
    public String author;
    public double[] ratings;

    public Novel(String title, String author, double[] ratings) {
        this.title = title;
        this.author = author;
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings,ratings.length);
    }

    public void addRating(double rating){
        this.ratings = Arrays.copyOf(ratings,ratings.length+1);
        this.ratings[ratings.length-1]=rating;
    }

    public void removeRating(double rating){
        int index=-1;
        for(int i=0; i<ratings.length; i++){
            if(ratings[i]==rating)
            {
                index=i;
                break;
            }
        }
        double[] newratings = new double[ratings.length-1];
        System.arraycopy(ratings,0,newratings,0,index);
        System.arraycopy(ratings,index+1,newratings,index,ratings.length-index-1);
        this.ratings=newratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Novel novel = (Novel) o;
        return Objects.equals(title, novel.title) && Objects.equals(author, novel.author) && Objects.deepEquals(ratings, novel.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, Arrays.hashCode(ratings));
    }

    @Override
    public String toString() {
        return "Novel: "+title+", "+author+", "+Arrays.toString(ratings);
    }
}
