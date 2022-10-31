import resolve.MathResolve;
import values.FindValue;
import values.MinValues;

public class Main {
    public static void main(String[] args) {
        /*
        #1 Write a method in Java to get the difference between the largest and smallest values in an array of integers.
        The length of the array must be 1 and above.
         */
        int [] numbers = {10,15,30,5,78};
        System.out.println("The difference between smallest and larges amount is: " + FindValue.findValue(numbers));

        /*
        #2 Write a method in Java to find the smallest and second-smallest elements of a given array
         and print it in the console.
         */
        MinValues.minValues(numbers);

        /*
        #3 Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set
        in your code.
         */
        double x = 2;
        double y = 5;
        MathResolve.mathResolve(x,y);
    }
}
