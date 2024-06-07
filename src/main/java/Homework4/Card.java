package Homework4;

public class Card {
    private String cardNumber;
    private String date;
    private String cvv;
    private String pinCode;

    public Card(String number, String date, String cvv, String pinCode) {
        this.cardNumber = number;
        this.date = date;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public String myNumber() {
        return cardNumber;
    }


    public void cardMask(String cardNumber) {
        String maskedCard = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("**** **** **** " + maskedCard);
    }

    public void pinCheck (String yourPincode) {
        if (yourPincode.equals(pinCode)) {
            System.out.println(cardNumber);
        }
        else {
            System.out.println("Неверный пин-код");
        }

    }
}
