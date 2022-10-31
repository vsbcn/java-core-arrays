package values;

public class MinValues {
    public static void minValues(int[] values) {
        int min = values[0];
        int secondMin = values[0];
        if (values.length >= 1) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] < min) {
                    secondMin = min;
                    min = values[i];
                }
                else if (values[i] > min && values[i] < secondMin) {
                    secondMin = values[i];
                }
            }
        } else {
            System.err.print("Invalid value. Arrays should have at least 1 element");
        }
        System.out.println("> The samllest value is: " + min);
        System.out.println(">> The second smallest values is: " + secondMin);
    }
}