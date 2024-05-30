package Homework2;

public class Task3 {
    public static void main(String[] args) {
        Item item1 = new Item("Холодильник", 12345, 30000.0, 10, "Белый", 55.0 );
        System.out.println("Наименование: " + item1.name);
        System.out.println("Артикул: " + item1.vendorCode);
        System.out.println("Цена: " + item1.goodPrice + " руб.");
        System.out.println("Количество: " + item1.quantity);
        System.out.println("Цвет: " + item1.color);
        System.out.println("Вес: " + item1.weight + " кг.");

        System.out.println();

        Item item2 = new Item("Стиральная машина", 12346, 25000.0, 15, "Серебристый", 45.0);
        System.out.println("Наименование: " + item2.name);
        System.out.println("Артикул: " + item2.vendorCode);
        System.out.println("Цена: " + item2.goodPrice + " руб.");
        System.out.println("Количество: " + item2.quantity);
        System.out.println("Цвет: " + item2.color);
        System.out.println("Вес: " + item2.weight + " кг.");

        System.out.println();

        Item item3 = new Item("Микроволновая печь", 12347, 7500.0, 7, "Черный металик", 10.0);
        System.out.println("Наименование: " + item3.name);
        System.out.println("Артикул: " + item3.vendorCode);
        System.out.println("Цена: " + item3.goodPrice + " руб.");
        System.out.println("Количество: " + item3.quantity);
        System.out.println("Цвет: " + item3.color);
        System.out.println("Вес: " + item3.weight + " кг.");

        System.out.println();

        Item item4 = new Item("Винный шкаф", 12348, 31990.0, 2, "Черный матовый", 23.5);
        System.out.println("Наименование: " + item4.name);
        System.out.println("Артикул: " + item4.vendorCode);
        System.out.println("Цена: " + item4.goodPrice + " руб.");
        System.out.println("Количество: " + item4.quantity);
        System.out.println("Цвет: " + item4.color);
        System.out.println("Вес: " + item4.weight + " кг.");

        System.out.println();

        Item item5 = new Item("Газовая плита", 12349, 33000.0, 11, "Черный", 40.0);
        System.out.println("Наименование: " + item5.name);
        System.out.println("Артикул: " + item5.vendorCode);
        System.out.println("Цена: " + item5.goodPrice + " руб.");
        System.out.println("Количество: " + item5.quantity);
        System.out.println("Цвет: " + item5.color);
        System.out.println("Вес: " + item5.weight + " кг.");
    }
}
