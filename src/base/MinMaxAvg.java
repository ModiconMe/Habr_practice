package base;

import java.util.Arrays;
//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

public class MinMaxAvg {
    private static double max;
    private static double min;
    private static double sumOfEl;
    private static double avg;
    public static String minMaxAvgArray(double[] arr) {
        for(int i = 0; i<arr.length; i++){
            arr[i] = Math.random()*10000;
            max = arr[0];
            min = arr[0];
        }
        for(int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sumOfEl+=arr[i];
        }
        avg = sumOfEl/arr.length;
        return "Min value = " + min + "\nMax value = " + max + "\nAverage value = " + avg;
    }
}
