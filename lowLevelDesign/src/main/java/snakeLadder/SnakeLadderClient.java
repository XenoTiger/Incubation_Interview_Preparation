package snakeLadder;

import java.util.Arrays;
import java.util.List;

public class SnakeLadderClient {
    public static void main(String[] args) {

        List<String> players = Arrays.asList("Niraj", "Virat");
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame(players);
        snakeAndLadderGame.play();
    }
}
