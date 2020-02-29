import java.util.Random;

public enum Type {
    ROCK,
    PAPER,
    SCISORS;

    public static Type getRandomType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static boolean attackSuccess(Attack a, Defense d) {
        if ((a.type == ROCK) && (d.type == SCISORS) ) {
            return true;
        }
        if ((a.type == SCISORS) && (d.type == PAPER) ) {
            return true;
        }
        if ((a.type == PAPER) && (d.type == ROCK) ) {
            return true;
        }
        return false;
    }
}
