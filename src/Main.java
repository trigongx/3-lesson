import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] digit = {4.3, 2.3, 4.2, -3.1, 3.1, 1.2, 1.3, -2.3, 6.5, 7.3, -5.1, 8.4, 1.7, -2.9, 3.9};
        int negativeNum = -1;
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] < 0) {
                negativeNum = i;
                break;
            }
        }
        if (negativeNum == -1) {
            System.out.println("В массиве нету отрицательных чисел");
            return;
        }
        double numberSum = 0;
        int numberCount = 0;
        for (int i = negativeNum + 1; i < digit.length; i++) {
            if (digit[i] > 0) {
                numberSum += digit[i];
                numberCount++;
            }
        }
        if (numberCount == 0) {
            System.out.println("В массиве нет положительных чисел после первого отрицательного числа");
            return;
        }
        double avgResult = numberSum / numberCount;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа:" + avgResult);


        //Доп.задание
        int n = digit.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (digit[j] > digit[j + 1]) {
                    double temp = digit[j];
                    digit[j] = digit[j + 1];
                    digit[j + 1] = temp;
                }

            }
            System.out.println("Выводим отсортированный массив с каждой итерацией" + Arrays.toString(digit));
        }
    }

}
