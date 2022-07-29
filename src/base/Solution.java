package base;

public class Solution {
    public static void main(String[] args) {
        double[] arr = new double[100];
        System.out.println(MinMaxAvg.minMaxAvgArray(arr));
        System.out.println(BubbleSort.bubbleSort(arr));
        SimpleNum.simpleNum();


        int[] arr1 = {0,1,2,2,3,0,4,2};
        int delete = 3;
        System.out.println(DeleteNum.deleteNumArray(arr1,delete));

    }
}
