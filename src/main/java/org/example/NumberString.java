//Завдання 2
//Напишіть програму, яка створить рядок, в якому знаходяться всі
//цілі числа, починаючи з 1, виписані в один рядок
//«123456789101112131415...». Рядок має бути довжиною не
//більше 1 000 символів.
//За числом n (введеного з клавіатури), виведіть цифру на
//n-й позиції (використовується нумерація з 1).
import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть позицію (n): ");
        int n = scanner.nextInt();
        scanner.close();

        // Створюємо рядок з цілими числами
        StringBuilder numberString = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            numberString.append(i);
            if (numberString.length() >= 1000) {
                break;
            }
        }

        // Виводимо цифру на заданій позиції
        if (n >= 1 && n <= numberString.length()) {
            char digit = numberString.charAt(n - 1);
            System.out.println("Цифра на позиції " + n + ": " + digit);
        } else {
            System.out.println("Невірна позиція. Рядок занадто короткий.");
        }
    }
}

