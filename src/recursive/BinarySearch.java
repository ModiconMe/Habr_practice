package recursive;

import java.util.HashSet;
import java.util.TreeSet;

public class BinarySearch {
    public static int whileBinarySearch(int[] arr, int el){
        int first = 0;
        int last = arr.length-1;
        while(first <= last){
            int middle = first + (last - first)/2;
            if(el == arr[middle]){
                return middle;
            } else if (el > arr[middle]){
                first = middle + 1;
            } else if (el < arr[middle]){
                last = middle - 1;
            }
        }
        return -1;
}


    public static int recursiveBinarySearch(int[] arr, int key, int first, int last){
        int middle = first + (last - first)/2;
        if(first > last){
            return -1;
        }
        if (key == arr[middle]) {
            return middle;
        } else if (key > arr[middle]) {
            first = middle + 1;
            return recursiveBinarySearch(arr, key, first, last);
        } else if (key < arr[middle]) {
            last = middle - 1;
            return recursiveBinarySearch(arr, key, first, last);
        }
        System.out.println("heloo");
        return -1;

}
}

