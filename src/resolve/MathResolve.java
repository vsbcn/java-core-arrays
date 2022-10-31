package resolve;

public class MathResolve {
    public static void mathResolve (double x, double y){
        double result = Math.pow(x,2) + Math.pow(4*y/5-x,2);
        System.out.println("Here is the result of solving the mathematical expression: " + result);
    }
}
