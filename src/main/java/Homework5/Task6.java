package Homework5;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();

        Player player1 = new Player(1, "Player1", false);
        Player player2 = new Player(2, "Player2", false);
        Player player3 = new Player(3, "Player3", false);
        Player player4 = new Player(4, "Player4", false);
        Player player5 = new Player(5, "Player5", false);
        Player player6 = new Player(6, "Player6", false);
        Player player7 = new Player(7, "Player7", false);
        Player player8 = new Player(8, "Player8", false);
        Player player9 = new Player(9, "Player9", false);
        Player player10 = new Player(10, "Player10", false);

        points.put(player1, 0);
        points.put(player2, 0);
        points.put(player3, 0);
        points.put(player4, 0);
        points.put(player5, 0);
        points.put(player6, 0);
        points.put(player7, 0);
        points.put(player8, 0);
        points.put(player9, 0);
        points.put(player10, 0);

        points.put(player4, 10);
        points.put(player7, 12);
        points.put(player8, 11);
        points.put(player9, 13);
        points.put(player10, 5);


        }


    }








