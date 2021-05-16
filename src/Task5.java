import java.util.Random;

class Warrior {
    final private String name;
    private int health;
    private int attack;
    private boolean isLive;

    public String getName() {
        return name;
    }

    public Warrior(String name) {
        this.name = name;
        this.attack = 0;
        isLive = true;
        health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}

interface WinnerStatus {
    void win(Warrior warrior);
}

final class BattleField {

    public void battle(Warrior first, Warrior second, WinnerStatus winnerStatus) {
        int counter = 1;
        boolean run = true;
        while (run) {
            if (counter % 2 != 0) {
                //атакующий
                run = attack(first, second, winnerStatus);
            } else {
                //зашищающийся
                run = attack(second, first, winnerStatus);
            }
            counter++;
        }
    }

    private boolean attack(Warrior warriorAttack, Warrior warriorDefence, WinnerStatus winnerStatus) {
        warriorAttack.setAttack(new Random().nextInt(100));
        warriorDefence.setHealth(warriorDefence.getHealth() - warriorAttack.getAttack());

        if (warriorDefence.getHealth() <= 0) {
            warriorDefence.setHealth(0);
            warriorDefence.setLive(false);
        }

        System.out.printf("Войн %s(здоровье:%d) ударил на %d война %s(здоровье:%d) \n",
                warriorAttack.getName(),
                warriorAttack.getHealth(),
                warriorAttack.getAttack(),
                warriorDefence.getName(),
                warriorDefence.getHealth());

        if (!warriorDefence.isLive()) winnerStatus.win(warriorAttack);

        return warriorDefence.isLive();
    }

}

public class Task5 {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("Данила");
        Warrior warrior2 = new Warrior("Ильюша");

        BattleField battleField = new BattleField();
        battleField.battle(warrior1, warrior2, (warrior) -> System.out.println("Победил:" + warrior.getName()));

    }

}
