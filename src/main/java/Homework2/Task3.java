package Homework2;

public class Task3 {
    public static void main(String[] args) {
        Item item1 = new Item("Холодильник", 12345, 30000.0, 10, "Белый", 55.0 );
        Item item2 = new Item("Стиральная машина", 12346, 25000.0, 15, "Серебристый", 45.0);
        Item item3 = new Item("Микроволновая печь", 12347, 7500.0, 7, "Черный металик", 10.0);
        Item item4 = new Item("Винный шкаф", 12348, 31990.0, 2, "Черный матовый", 23.5);
        Item item5 = new Item("Газовая плита", 12349, 33000.0, 11, "Черный", 40.0);


        System.out.println(item1.vendorCode + " - "+ item1.name + " - " + item1.goodPrice + " руб." + " - " + item1.quantity + " шт." + " - " + item1.color + " - " + item1.weight + " кг.");
        System.out.println(item2.vendorCode + " - "+ item2.name + " - " + item2.goodPrice + " руб." + " - " + item2.quantity + " шт." + " - " + item2.color + " - " + item2.weight + " кг.");
        System.out.println(item3.vendorCode + " - "+ item3.name + " - " + item3.goodPrice + " руб." + " - " + item3.quantity + " шт." + " - " + item3.color + " - " + item3.weight + " кг.");
        System.out.println(item4.vendorCode + " - "+ item4.name + " - " + item4.goodPrice + " руб." + " - " + item4.quantity + " шт." + " - " + item4.color + " - " + item4.weight + " кг.");
        System.out.println(item5.vendorCode + " - "+ item5.name + " - " + item5.goodPrice + " руб." + " - " + item5.quantity + " шт." + " - " + item5.color + " - " + item5.weight + " кг.");


    }
}
