public class Task9 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) { //5

            boolean isExit = true;//+

            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 5/2 = 2
                    isExit = false;
                    break;
                }
            }

            if (isExit) {
                System.out.println(i);
            }
        }
    }
}
