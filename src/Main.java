public class Main {
    public static void main(String[] args) {

        SnakeLadder player1 = new SnakeLadder();
        SnakeLadder player2 = new SnakeLadder();

        int currentPlayer = 1;

        while (true) {

            if (currentPlayer == 1) {
                System.out.println(" \nPLAYER 1 TURN ");
                boolean ladder = player1.display();
                if (player1.startPosition == 100) {
                    System.out.println("PLAYER 1 WON!");
                    break;
                }
                if (!ladder) {
                    currentPlayer = 2;
                }
            } else {
                System.out.println("  \nPLAYER 2 TURN");
                boolean ladder = player2.display();
                if (player2.startPosition == 100) {
                    System.out.println("PLAYER 2 WON!");
                    break;
                }
                if (!ladder) {
                    currentPlayer = 1;
                }
            }
        }
    }
}