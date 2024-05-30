package Homework2;

public class Flat {
    public int floor;            // Этаж
    public int numberOfRooms;    // Количество комнат
    public double area;          // Площадь квартиры в квадратных метрах
    public boolean hasBalcony;   // Наличие балкона
    public double price;         // Цена квартиры


    public Flat(int floor, int numberOfRooms, double area, boolean hasBalcony, double price) {
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
        this.hasBalcony = hasBalcony;
        this.price = price;
    }
}
