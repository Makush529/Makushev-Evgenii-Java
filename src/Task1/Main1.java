package Task1;
/*
1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
        - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
        - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт программы\nВведите два числа:");

        int numA = 0;
        int numB = 0;
        try {
            numA = scanner.nextInt();
            numB = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода чисел " + e);
            return;
        }

        if (numA < numB) {
            System.out.println("a<b");
        }
        if (numA > numB) {
            System.out.println("a>b");
        }
        if (numA == numB) {
            System.out.println("a=b");
        }

        int resultSum = numA + numB;
        System.out.println("Результат сложения " + resultSum);
        int resultDif = numA - numB;
        System.out.println("Результат вычитания " + resultDif);
        int resultMult = numA * numB;
        System.out.println("Результат умножения " + resultMult);
        if (numB != 0) {
            double resultDiv = (double) numA / numB;
            System.out.println("Результат деления: " + resultDiv);
        } else {
            System.out.println("Ошибка: деление на ноль невозможно.");
        }
        System.out.println("Программа завершена");
        scanner.close();
    }
}