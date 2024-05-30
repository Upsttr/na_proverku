package Homework2;

public class Item {
    public String name; // Название товара
    public int vendorCode; // Артикул
    public double goodPrice; // Цена товара
    public int quantity; // Количество
    public String color; // Цвет
    public double weight; // Вес

    public Item(String name, int vendorCode, double goodPrice, int quantity, String color, double weight) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.goodPrice = goodPrice;
        this.quantity = quantity;
        this.color = color;
        this.weight = weight;
    }
}
