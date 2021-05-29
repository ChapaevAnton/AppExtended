import java.util.Arrays;

public class Task11 {

    public static short size = 8;
    public static int[][] ints = new int[size][];

    public static void main(String[] args) {

        ints[0] = new int[]{1};
        ints[1] = new int[]{1, 1};


        for (int i = 2; i < ints.length; i++) {

            int[] line = new int[i + 1];

            line[0] = line[i] = 1;

            for (int j = 1; j < line.length-1; j++) {

                line[j] = ints[i - 1][j - 1] + ints[i - 1][j];
            }

            ints[i] = line;
        }


        for (int i = 0; i < size; i++) {
            System.out.print(Arrays.toString(ints[i]));
            System.out.println();

        }

    }
}
