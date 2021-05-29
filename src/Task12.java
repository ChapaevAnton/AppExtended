import java.util.Arrays;

public class Task12 {

    public static Character[] output;
    public static String[] strings = new String[]{
            "Claudius, King of Denmark.",
            "Hamlet, Son to the former, and Nephew to the present King.",
            "Polonius, Lord Chamberlain.",
            "Horatio, Friend to Hamlet.",
            "Laertes, Son to Polonius.",
            "Voltimand, Courtier.",
            "Cornelius, Courtier.",
            "Rosencrantz, Courtier.",
            "Guildenstern, Courtier.",
            "Osric, Courtier.",
            "A Gentleman, Courtier.",
            "A Priest.",
            "Marcellus, Officer.",
            "Bernardo, Officer.",
            "Francisco, a Soldier",
            "Reynaldo, Servant to Polonius.",
            "Players.",
            "Two Clowns, Grave-diggers.",
            "Fortinbras, Prince of Norway.",
            "A Captain.",
            "English Ambassadors.",
            "Ghost of Hamlet's Father."
    };

    public static void main(String[] args) {
        // code here...
        int value = 5;
        Arrays.stream(getCharArray(value, strings)).forEach(System.out::print);
    }

    public static Character[] getCharArray(int count, String[] string) {
        Character[] temp = new Character[string.length];
        for (int i = 0; i < string.length; i++) {
            temp[i] = string[i].charAt(count);
        }
        return temp;
    }

}
