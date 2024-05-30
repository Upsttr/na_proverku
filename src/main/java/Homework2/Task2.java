package Homework2;

public class Task2 {
    public static void main(String[] args) {
        // Создание объекта типа Flat с указанием значений полей
        Flat flat = new Flat(8, 4, 120.5, true, 7500000.0);
        System.out.println("Этаж: " + flat.floor);
        System.out.println("Количество комнат: " + flat.numberOfRooms);
        System.out.println("Площадь: " + flat.area + " кв. м");
        System.out.println("Наличие балкона: " + (flat.hasBalcony ? "Да" : "Нет"));
        System.out.println("Цена: " + flat.price + " руб.");

        System.out.println();

        Flat flat2 = new Flat(5, 3, 85.0, false, 5200000.0);
        System.out.println("Этаж: " + flat2.floor);
        System.out.println("Количество комнат: " + flat2.numberOfRooms);
        System.out.println("Площадь: " + flat2.area + " кв. м");
        System.out.println("Наличие балкона: " + (flat2.hasBalcony ? "Да" : "Нет"));
        System.out.println("Цена: " + flat2.price + " руб.");
    }
}
