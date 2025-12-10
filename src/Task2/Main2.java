package Task2;

//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
//В результате сравнения в консоль должно быть выведено одно из сообщений:
//        "Строки неидентичны" или "Строки идентичны"

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт программы");
        System.out.print("Введите первую строку: ");
        String lineA = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String lineB = scanner.nextLine();

        if (lineA.equals(lineB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        System.out.println("Программа завершена");
        scanner.close();
    }
}
