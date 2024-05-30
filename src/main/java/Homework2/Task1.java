package Homework2;

public class Task1 {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        String cardNumber1 = "1234567890123456";
        System.out.println("**** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("**** **** **** " + cardNumber1.substring(cardNumber1.length() - 4));
    }
}
