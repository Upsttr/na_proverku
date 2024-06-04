package Homework3;

public class Players {
    public static void main(String[] args) {

        // Задание 6. Массив строк. Вывод первых 3х игроков.

        String[] players = new String[10];
        players[0] = "Александр";
        players[1] = "Борис";
        players[2] = "Владимир";
        players[3] = "Григорий";
        players[4] = "Дмитрий";
        players[5] = "Евгений";
        players[6] = "Захар";
        players[7] = "Игорь";
        players[8] = "Константин";
        players[9] = "Леонид";

        int i;
        for (i = 0; i < 3; i++)
            System.out.println(players[i]);
    }
}
