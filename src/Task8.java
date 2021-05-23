import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Программа сравнения значений y=sin(cos(x)) и y=cos(sin(x)");
        System.out.println("Введите нижнее значение x:");
        Scanner scanner = new Scanner(System.in);
        double x_down = scanner.nextDouble();
        System.out.println("Введите верхнее значение x:");
        double x_up = scanner.nextDouble();
        System.out.println("Введите шаг дискретизации:");
        double step = scanner.nextDouble();


        for (double i = x_down; i <= x_up; i += step) {

            double sin = Math.sin(Math.cos(i));
            double cos = Math.cos(Math.sin(i));

            if (sin < cos) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + sin + "; cos(sin(x)) = " + cos + ". sin(cos(x)) меньше, чем cos(sin(x))");
            } else if (sin > cos) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + sin + "; cos(sin(x)) = " + cos + ". sin(cos(x)) больше, чем cos(sin(x))");
            } else {
                System.out.println("При x = " + i + " sin(cos(x)) = " + sin + "; cos(sin(x)) = " + cos + ". sin(cos(x)) равен cos(sin(x))");
            }

        }

    }


}