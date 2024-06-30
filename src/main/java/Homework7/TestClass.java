package Homework7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

public class TestClass {

    public static void main(String[] args) throws IOException {
        PlayerService service = new PlayerServiceJSON();


        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);

        playerId = service.createPlayer("Vasya666PK");
        service.addPoints(playerId, 100);

        playerId = service.createPlayer("Hunter87Rus");
        service.addPoints(playerId, 100);

        // тестируем методы сервиса

        service.deletePlayer(2);
        service.addPoints(3, 78);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }





    }
}