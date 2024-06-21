package Homework5;

import java.util.Objects;

public class Player {
    private int id;
    private String nickName;
    private boolean isOnline;

    public Player(int id, String nickName, boolean isOnline) {
        this.id = id;
        this.nickName = nickName;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickName, player.nickName);
    }


    public int hashCode() {
        return Objects.hash(id, nickName, isOnline);
    }


    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
