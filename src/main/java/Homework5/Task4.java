package Homework5;

import java.util.List;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();


        // Менее компактный вариант, списки фильмов через ArrayList. Подойдет, если мы планируем менять список фильмов.

//        List<String> movies1 = new ArrayList<>();
//        movies1.add("Interstellar");
//        movies1.add("Top gun");
//        movies1.add("Forrest Gump");
//        companies.add(new Company("Paramount pictures", 1912, movies1));
//
//        List<String> movies2 = new ArrayList<>();
//        movies2.add("Barbie");
//        movies2.add("The Dark Knight");
//        movies2.add("Joker");
//        companies.add(new Company("Warner Bros.", 1923, movies2));
//
//        List<String> movies3 = new ArrayList<>();
//        movies3.add("Back to the Future");
//        movies3.add("Schindler's List");
//        movies3.add("Jurassic Park");
//        companies.add(new Company("Universal Studios", 1912, movies3));


        // Более компактный, но менее гибкий вариант через неизменяемый список.


        List<String> movies1 = List.of("Interstellar", "Top gun", "Forrest Gump");
        companies.add(new Company("Paramount pictures", 1912, movies1));

        List<String> movies2 = List.of("Barbie", "The Dark Knight", "Joker");
        companies.add(new Company("Warner Bros.", 1923, movies2));

        List<String> movies3 = List.of("Back to the Future", "Schindler's List", "Jurassic Park");
        companies.add(new Company("Universal Studios", 1912, movies3));


        for (Company company : companies) {
            System.out.println(company.getName() + ":" + company.getMovies());
        }
    }
}
