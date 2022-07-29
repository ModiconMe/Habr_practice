package basics_of_OOP;

public class WeightArray {
    private int length;
    private int el[] = new int[length];
    private int weight[] = new int[length];

    public WeightArray(int length, int[] el, int[] weight) {
        this.length = length;
        this.el = el;
        this.weight = weight;
    }

    public String weightReturn(){
        int sum = 0;
        for (int i = 0; i < length; i++){
            sum += this.weight[i];
        }
        double weight = Math.random()*sum;
        int num = 0;
        int prev = 0;
        int ongoing = 0;
        for (int i = 0; i < length; i++){
            ongoing += this.weight[i];
            if(weight > prev && weight < ongoing){
                num = this.el[i];
                break;
            }
            prev = ongoing;
        }
        return "Num is " + num + "\n Weight is " + weight + "Sum is " + sum;
    }
}
