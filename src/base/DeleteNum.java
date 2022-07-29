package base;

import java.util.Arrays;

//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
public class DeleteNum {
    public static String deleteNumArray(int[] arr, int num){
        int[] newArr = new int[arr.length];

        int length = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                length++;

            }
        }
        int[] returnArr = new int[length];
        for (int i = 0, j = 0; j<length; i++){
            if (arr[i] != num){
                returnArr[j] = arr[i];
                j++;
            }
        }
        return Arrays.toString(returnArr);
    }
}
