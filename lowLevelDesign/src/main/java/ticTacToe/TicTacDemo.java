package ticTacToe;

public class TicTacDemo {

    public static void main(String[] args) {
        Player player1 = new Player("Niraj", 'X');
        Player player2 = new Player("Virat", 'O');

        Game game = new Game(player1, player2);
        game.play();
    }

}
