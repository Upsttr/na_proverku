package Homework7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlayerServiceJSON implements PlayerService {

    private Map<Integer, Player> playerMap = new HashMap<>();
    private int nextId = 1;
    private Path filepath = Path.of("homework.json");
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public Player getPlayerById(int id) {
        return playerMap.get(id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return playerMap.values();
    }

    @Override
    public int createPlayer(String nickname) {
        Player player = new Player(nextId, nickname, 0, false);
        playerMap.put(nextId, player);
        try {
            saveToFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nextId++;
    }

    @Override
    public Player deletePlayer(int id) {
        try {
            saveToFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return playerMap.remove(id);
    }

    @Override
    public int addPoints(int playerId, int points) {
        Player player = playerMap.get(playerId);
        if (player != null) {
            int newPoints = player.getPoints() + points;
            player.setPoints(newPoints);
            try {
                saveToFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return newPoints;
        }
        return -1;

    }

    private void saveToFile() throws IOException {
        mapper.writeValue(filepath.toFile(), playerMap);
    }
}



