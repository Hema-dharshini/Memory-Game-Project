import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Memory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ✅ You can change this number for more pairs
        int numPairs = 4; // A,B,C,D (4 pairs = 8 cards)

        ArrayList<String> cards = new ArrayList<>();

        // Generate pairs (A, B, C, ...)
        for (char c = 'A'; c < 'A' + numPairs; c++) {
            cards.add(String.valueOf(c));
            cards.add(String.valueOf(c));
        }

        // Shuffle cards
        Collections.shuffle(cards);

        String[] board = new String[cards.size()];
        boolean[] flipped = new boolean[cards.size()];
        Arrays.fill(board, " ");

        int pairsFound = 0;
        int moves = 0;

        // ✅ Track player scores
        int player1Score = 0;
        int player2Score = 0;
        int currentPlayer = 1; // Start with Player 1

        System.out.println("🎮 Welcome to the 2-Player Memory Game!");

        while (pairsFound < numPairs) {
            System.out.println("\n⭐ Player " + currentPlayer + "'s turn ⭐");
            printBoard(board, flipped);

            // Flip first card
            int firstIndex = flipCard(scanner, board, flipped, cards, "Enter index of first card:");
            printBoard(board, flipped);

            // Flip second card
            int secondIndex = flipCard(scanner, board, flipped, cards, "Enter index of second card:");
            printBoard(board, flipped);

            moves++;

            if (cards.get(firstIndex).equals(cards.get(secondIndex))) {
                System.out.println("Player " + currentPlayer + " found a pair!");
                pairsFound++;

                // Add score
                if (currentPlayer == 1) {
                    player1Score++;
                } else {
                    player2Score++;
                }

                // Player gets another turn → don't switch
            } else {
                System.out.println("Not a match!");
                // Flip back
                board[firstIndex] = " ";
                board[secondIndex] = " ";
                flipped[firstIndex] = false;
                flipped[secondIndex] = false;

                // Switch players
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }

        // ✅ Game over → show results
        System.out.println("\n🎉 Game Over!");
        System.out.println("📊 Total moves used: " + moves);
        System.out.println("Player 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("🏆 Player 1 Wins!");
        } else if (player2Score > player1Score) {
            System.out.println("🏆 Player 2 Wins!");
        } else {
            System.out.println("🤝 It's a Draw!");
        }

        scanner.close();
    }

    // ✅ Handles card flipping
    public static int flipCard(Scanner scanner, String[] board, boolean[] flipped, ArrayList<String> cards, String prompt) {
        int index;
        while (true) {
            System.out.println(prompt);
            index = scanner.nextInt();
            if (index < 0 || index >= board.length) {
                System.out.println("⚠ Invalid index, try again.");
            } else if (flipped[index]) {
                System.out.println("⚠ Card already flipped, try again.");
            } else {
                board[index] = cards.get(index);
                flipped[index] = true;
                break;
            }
        }
        return index;
    }

    // ✅ Print board with indexes
    public static void printBoard(String[] board, boolean[] flipped) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < board.length; i++) {
            if (flipped[i]) {
                System.out.print("| " + board[i] + " ");
            } else {
                System.out.print("| " + i + " ");
            }
        }
        System.out.println("|");
    }
}
