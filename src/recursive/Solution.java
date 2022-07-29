package recursive;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
/*        int el = 1_000_000_00;
        int[] arr = new int[el];
        for (int i = 0; i < el; i++){
            arr[i] = (int)(Math.random()*1_00);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        long time = System.currentTimeMillis();
        System.out.println(BinarySearch.recursiveBinarySearch(arr,51,0,arr.length-1));
        System.out.println((System.currentTimeMillis() - time));

        System.out.println("----------");

        time = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++){
            if (51 == arr[i]){
                System.out.println(i);
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - time);*/

        double x1 = 0;
        double x2 = 10;
        double offset = 0.001;
        System.out.println(EquationSolution.solution(x1,x2,offset));

        HashTree<String, Integer> hashTree = new HashTree<>();

        hashTree.add("Sergay", 40);
        hashTree.add("Dmitry", 23);
        hashTree.add("Vladimir", 39);
        hashTree.add("Ludmila", 35);
        hashTree.add("Timur", 25);
        hashTree.add("Vitya", 27);
        hashTree.add("Artem", 37);
        hashTree.add("ilya", 30);
        hashTree.add("vlad", 39);
        hashTree.add("semen", 42);

        hashTree.remove("Vladimir");

//        System.out.println(hashTree.get("Vladimir"));
        System.out.println(hashTree.get("Artem"));

        hashTree.remove("Artem");

        System.out.println(hashTree.get("Artem"));
    }
}
