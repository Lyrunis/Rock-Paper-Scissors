import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;
        String playAItem;
        String playBItem;

        do {
            //input for Player A and B with checker
            System.out.print("Player A: Enter your move (R/P/S): ");
            String playerAMove = scanner.nextLine().toUpperCase();

            while (!isValidMove(playerAMove)) {
                System.out.print("Invalid move. Please enter R, P, or S: ");
                playerAMove = scanner.nextLine().toUpperCase();
            }

            System.out.print("Player B: Enter your move (R/P/S): ");
            String playerBMove = scanner.nextLine().toUpperCase();

            while (!isValidMove(playerBMove)) {
                System.out.print("Invalid move. Please enter R, P, or S: ");
                playerBMove = scanner.nextLine().toUpperCase();
            }

            System.out.println("Player A: " + playerAMove);
            System.out.println("Player B: " + playerBMove);

            //character converter
            if (playerAMove.equals("R")){
                playAItem = "Rock";
            }
            else if (playerAMove.equals("P")){
                playAItem = "Paper";
            }
            else{
                playAItem = "Scissors";
            }

            if (playerBMove.equals("R")){
                playBItem = "Rock";
            }
            else if (playerBMove.equals("P")){
                playBItem = "Paper";
            }
            else{
                playBItem = "Scissors";
            }

            //Game logic
            if (playerAMove.equals(playerBMove)) {
                System.out.println(playAItem + " versus " + playBItem + " It's a tie!");
            } else if ((playerAMove.equals("R") && playerBMove.equals("S")) ||
                       (playerAMove.equals("P") && playerBMove.equals("R")) ||
                       (playerAMove.equals("S") && playerBMove.equals("P"))) {
                System.out.println(playAItem + " versus " + playBItem + " Player A wins!");
            } else {
                System.out.println(playAItem + " versus " + playBItem + " Player B wins!");
            }

            //Play again loop question
            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();;

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing!");
    }

    private static boolean isValidMove(String move) {
        return move.equals("R") || move.equals("P") || move.equals("S");
    }
}