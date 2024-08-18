//Необходимо реализовать следующий метод:
//
//Получаем на входе массив чисел.
//Все четные числа увеличиваем на единицу.
//Возвращаем кусок списка с 3-го по 7-й элемент.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(processNumbersFirstVariant(numbers)));
        System.out.println(Arrays.toString(processNumbersSecondVariant(numbers)));
    }

    public static int[] processNumbersFirstVariant(int[] numbers) {
        int[] result = new int[5];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]++;
            }
            if (i >= 2 && i <= 6) {
                result[j++] = numbers[i];
            }
        }
        return result;
    }

    public static int[] processNumbersSecondVariant(int[] numbers) {
         return Arrays.stream(numbers, 2, 7)
                .map(number -> {
                    if(number % 2 == 0) {
                        return ++number;
                    }
                    else return number;
                })
                 .toArray();


    }
}