package values;

public class FindValue {
    public static int findValue(int[] values) {
        int min = values[0];
        int max = values[0];
        int difference;
        if (values.length >= 1) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] > max) {
                    max = values[i];
                } else if (values[i] < min) {
                    min = values[i];
                }
            }
        } else {
            System.err.print("Invalid value. Array should have at least one element.");
        }
        return difference = max - min;
    }
}
