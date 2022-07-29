package recursive;

public class EquationSolution {
    public static double fun(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x,4) - 345.3*x - 23;

    }
    public static double solution(double x1, double x2, double offset){

        double x = (x1 + x2)/2;

        if (fun(x) <= offset && fun(x) > -offset){
            return x;
        }
        if (fun(x) > 0){
            return solution(x1,x,offset);
        } else {
            return solution(x,x2,offset);
        }
    }
}
