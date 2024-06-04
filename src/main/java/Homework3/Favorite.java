package Homework3;

public class Favorite {
    public static void main(String[] args) {

        // Задание 3. Массив с тремя любимыми фильмами

        Movie[] films = new Movie[3];
        films[0] = new Movie("Fight Club", 8.2, "Thriller", "USA", false);
        films[1] = new Movie("Pulp Fiction", 8.1, "Criminal", "USA", true);
        films[2] = new Movie ("Apocalypse Now", 8.1, "Military", "USA", true);


        //  Задание 5. Выводим информацию о всех фильмах в формате "страна - название - жанр - рейтинг"

        int i;
        for (i = 0; i < films.length; i++)
            System.out.println(films[i].country + " - " + films[i].name + " - " + films[i].genre + " - " + films[i].rating);

    }
}
