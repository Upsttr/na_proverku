package Homework5;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Set<Player> listOfPlayers = new HashSet<>();

        Player player1 = new Player(1, "Player1", true);
        Player player2 = new Player(2, "Player2", true);
        Player player3 = new Player(3, "Player3", true);
        Player player4 = new Player(4, "Player4", true);
        Player player5 = new Player(5, "Player5", true);
        Player player6 = new Player(6, "Player6", true);
        Player player7 = new Player(7, "Player7", true);
        Player player8 = new Player(8, "Player8", true);
        Player player9 = new Player(9, "Player9", true);
        Player player10 = new Player(10, "Player10", true);


        listOfPlayers.add(player1);
        listOfPlayers.add(player2);
        listOfPlayers.add(player3);
        listOfPlayers.add(player4);
        listOfPlayers.add(player5);
        listOfPlayers.add(player6);
        listOfPlayers.add(player7);
        listOfPlayers.add(player8);
        listOfPlayers.add(player9);
        listOfPlayers.add(player10);

        // Проверяем, добавится ли дубликат

        Player player11 = new Player(2, "Player2", true);
        listOfPlayers.add(player11);

        for (Player player : listOfPlayers) {
            System.out.println(player);


        }
    }
}


