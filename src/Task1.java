import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Index {

    static double getBodyMassIndex(Human human) {

        double index = human.weight / (human.height * human.height);

        if (index < 16.6) System.out.println("Выраженный дефицит массы");
        else if (16.5 <= index && index <= 18.49) System.out.println("Недостаточная (дефицит) масса тела");
        else if (18.5 <= index && index <= 24.99) System.out.println("Норма");
        else if (25.0 <= index && index <= 29.99) System.out.println("Избыточная масса тела (предожирение)");
        else if (30.0 <= index && index <= 34.99) System.out.println("Ожирение первой степени");
        else if (35.0 <= index && index <= 39.99) System.out.println("Ожирение второй степени");
        else System.out.println("Ожирение третьей степени (морбидное)");
        return index;
    }
}

final class Human {
    double height;
    double weight;

    public Human(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
}

public class Task1 {
    public static void main(String[] args) {

        Human human = new Human(1.87, 68.0);
        double index = Index.getBodyMassIndex(human);
        System.out.println(index);


    }
}
