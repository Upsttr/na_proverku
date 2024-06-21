package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie("Fight Club", 8.2, "Thriller", "USA", false));
        films.add(new Movie("Pulp Fiction", 8.1, "Criminal", "USA", true));
        films.add(new Movie("Apocalypse Now", 8.1, "Military", "USA", true));

        System.out.println(films.get(1));
    }
}
