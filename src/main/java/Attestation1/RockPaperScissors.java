package Attestation1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[] choices = {'К', 'Н', 'Б'};
        int userScore = 0;
        int computerScore = 0;

        System.out.println("Игра началась!");

        for (int round = 1; round <= 5; round++) {
            System.out.println("\nРаунд " + round + ": выберите ваш ход (К - камень, Н - ножницы, Б - бумага):");
            char userChoice = Character.toUpperCase(scanner.next().charAt(0));

            // Генерируем случайный выбор компьютера
            char computerChoice = choices[random.nextInt(choices.length)];

            System.out.println("Вы выбрали: " + userChoice);
            System.out.println("Компьютер выбрал: " + computerChoice);

            // Определяем победителя раунда и добавляем очки
            int roundResult = evaluateRound(userChoice, computerChoice);
            if (roundResult > 0) {
                userScore += roundResult;
                System.out.println("Вы выиграли этот раунд! Получаете " + roundResult + " баллов.");
            } else if (roundResult < 0) {
                computerScore += -roundResult; // roundResult is negative, so subtract to add positive points
                System.out.println("Компьютер выиграл этот раунд! Получает " + (-roundResult) + " баллов.");
            } else {
                System.out.println("Ничья в этом раунде!");
            }
        }

        // Выводим итоговый счет и объявляем победителя
        System.out.println("\nИгра окончена!");
        System.out.println("Итоговый счет:");
        System.out.println("Вы: " + userScore + " баллов");
        System.out.println("Компьютер: " + computerScore + " баллов");

        if (userScore > computerScore) {
            System.out.println("Вы победили!");
        } else if (computerScore > userScore) {
            System.out.println("Компьютер победил!");
        } else {
            System.out.println("Ничья!");
        }

        scanner.close();
    }

    // Метод для оценки результата раунда
    private static int evaluateRound(char user, char computer) {
        if ((user == 'К' && computer == 'Н')) {
            return 1; // Победа пользователя камнем

        } else if ((user == 'Н' && computer == 'Б')) {
            return 2; // Победа пользователя ножницами

        } else if ((user == 'Б' && computer == 'К')) {
            return 5; // Победа пользователя бумагой

        } else if ((user == 'Н' && computer == 'К')) {
            return -1; // Победа компьютера камнем

        } else if ((user == 'Б' && computer == 'Н')) {
            return -2; // Победа компьютера ножницами

        } else if ((user == 'К' && computer == 'Б')) {
            return -5; // Победа компьютера бумагой


        } else {
            return 0; // Ничья
        }
    }
}
