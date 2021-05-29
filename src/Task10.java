import java.util.Arrays;

public class Task10 {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {
        // code here...

        for (int i = 0; i < numbers.length; i++) {

            if (i == 0 || i == 1) {
                numbers[i] = 1;
            }

            if (i < 30 && i > 1) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }

        }

        System.out.println(Arrays.toString(numbers));
    }
}
