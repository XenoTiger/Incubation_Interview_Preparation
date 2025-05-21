package snakeLadder;

import java.util.Random;

public class Dice {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 6;

    public int roll() {
        Random random = new Random();
        return random.nextInt(MAX_VALUE) + MIN_VALUE;

    }

}
