package Attestation1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите длину забора");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int length = 12 * 3 + 62 * 5; // длина надписи

        boolean fit = (x >= length);
        if (!fit) {
            System.out.println("Надпись не поместится");
        } else {
            System.out.println("Надпись поместится");
        }

    }
}
