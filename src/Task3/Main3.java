package Task3;

import java.util.Arrays;

//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
//необходимо написать программу, которая выведет в консоль все чётные числа.
public class Main3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String array = Arrays.toString(numbers);
        System.out.print("Массив " + array +"\nсодержит четные числа: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(" " + numbers[i]);
            }
        }
    }
}
