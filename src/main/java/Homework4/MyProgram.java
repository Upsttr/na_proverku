package Homework4;

public class MyProgram {
    public static void main(String[] args) {

        // Задание 6

Card c = new Card("1234567891234567", "10/25", "1415", "5533");

        c.cardMask(c.myNumber());
        c.pinCheck("5533");

    }
}
