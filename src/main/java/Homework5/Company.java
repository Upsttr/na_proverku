package Homework5;


import java.util.List;
import java.util.Objects;


public class Company {

    private String name;
    private int yearOfFoundation;
    private List<String> movies;

    public Company(String name, int yearOfFoundation, List<String> movies) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return yearOfFoundation == company.yearOfFoundation && Objects.equals(name, company.name) && Objects.equals(movies, company.movies);
    }


    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, movies);
    }


    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", movies=" + movies +
                '}';
    }
}
