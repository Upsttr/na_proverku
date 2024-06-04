package Homework3;

public class Movie {
    String name;
    double rating;
    String genre;
    String country;
    boolean hasOscar;

    public Movie(String name, double rating, String genre, String country, boolean hasOscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }
}
