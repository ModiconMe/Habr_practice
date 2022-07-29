package base;

import java.util.Arrays;
// Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class BubbleSort {
    private static boolean isSorted = false;
    private static double min = 0;

    public static String bubbleSort(double[] arr) {
        while (isSorted == false) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    min = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = min;
                    isSorted = false;
                }
            }
        }
        return Arrays.toString(arr);
    }
}

