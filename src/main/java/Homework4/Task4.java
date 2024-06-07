package Homework4;

public class Task4 {
    public static void main(String[] args) {

        // Задание 4

        String password = "GJVmnFZ5^^";

        boolean symbolCount = password.length() >= 8;
        boolean hasDigits = password.matches(".*\\d.*");
        boolean specialSymbols = password.matches(".*[!@#$%^&*№].*");

        if (symbolCount == true && hasDigits == true && specialSymbols == true) {
            System.out.println("Пароль принят");
        } else if (symbolCount == false && hasDigits == true && specialSymbols == true) {
            System.out.println("Пароль не менее 8 символов");
        } else if (symbolCount == true && hasDigits == false && specialSymbols == true) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        } else if (symbolCount == true && hasDigits == true && specialSymbols == false) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        } else if (symbolCount == true && hasDigits == false && specialSymbols == false) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        } else if (symbolCount == false && hasDigits == false && specialSymbols == true) {
            System.out.println("Пароль не менее 8 символов");
            System.out.println("Пароль должен содержать минимум 1 цифру");
        } else if (symbolCount == false && hasDigits == false && specialSymbols == false) {
            System.out.println("Пароль не менее 8 символов");
            System.out.println("Пароль должен содержать минимум 1 цифру");
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }
    }
}
