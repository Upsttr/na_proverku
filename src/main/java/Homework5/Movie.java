package Homework5;

import java.util.Objects;

public class Movie {
    private String name;
    private double rating;
    private String genre;
    private String country;
    private boolean hasOscar;

    public Movie(String name, double rating, String genre, String country, boolean hasOscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHasOscar() {
        return hasOscar;
    }

    public void setHasOscar(boolean hasOscar) {
        this.hasOscar = hasOscar;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(rating, movie.rating) == 0 && hasOscar == movie.hasOscar && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }


    public int hashCode() {
        return Objects.hash(name, rating, genre, country, hasOscar);
    }


    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", hasOscar=" + hasOscar +
                '}';
    }
}
