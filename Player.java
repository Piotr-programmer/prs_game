import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Player {
    private int score;
    private Attack attack = null;
    private Defense defence = null;


    Player() {
        score = 0;
    }

    void randomAttack() {
        attack = new Attack(Type.getRandomType());
    }

    void randomDefense() {
        defence = new Defense(Type.getRandomType());
    }

    Attack getAttack() {
        return attack;
    }

    Defense getDefence() {
        return defence;
    }

    void addPoint() {
        score++;
    }

    int getScore() {
        return score;
    }
}
