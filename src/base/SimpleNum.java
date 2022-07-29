package base;
//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
public class SimpleNum {
    public static void simpleNum(){
        int temp = 0;
        for (int i = 2; i<=100; i++){
            for (int j = 1; j<=i; j++){
                if (i%j == 0){
                    temp++;
                }
            }
            if (temp == 2){
                System.out.println(i);
            }
            temp = 0;
        }
    }
}
