import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int count = 0;
        boolean run = true;
        int x = new Random().nextInt(10);
        Scanner console = new Scanner(System.in);
        System.out.println("Загадано число от 0 до 10 -> " + x);
        System.out.println("Введите число что бы угадать");
        int number;
        do {
            number = console.nextInt();
            if (number < x) System.out.println("Загаданное число больше");
            else if (number > x) System.out.println("Загаданное число меньше");
            count++;
            if (count == 3 || number == x) run = false;
        } while (run);


        if (number == x) System.out.println("Поздравляю вы угадали, загаданное число равно: " + x);
        else System.out.println("Вы проиграли!");
    }

}
