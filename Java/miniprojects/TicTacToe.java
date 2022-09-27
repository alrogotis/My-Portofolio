package gr.aueb.cf.miniprojects;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Πρόγραμμα Παιχνιδιού τρίλιζας.
 * Εμφανίζει το ταμπλό του παιχνιδιού,
 * οπού οι παίχτες επιλεγούν τι θα παίξουν.
 * Το πρόγραμμα ελέγχει αμα έγινε τρίλιζα, αμα υπάρχει ισοπαλία,
 * ποιος παίκτης παίζει, αμα ο παίκτης έκανε τις σωστές επιλογές,
 * καθώς και ποιος παίκτης κέρδισε.
 */
public class TicTacToe {


    public static void main(String[] args)throws IOException{
        // Δήλωση και αρχικοποίηση μεταβλητών
        char[] board = {' ' , ' ' , ' ' , ' ' , ' ' , ' ' , ' ' , ' ' , ' '};
        char symbol = 'Χ';
        Scanner boxChoice = new Scanner(System.in);
        int boxPosition = 0;
        boolean player1 = true;
        System.out.println("Lets play a tic tac toe game");

        // Δομή παιχνιδιού
        while (istriliza(board) == false && isDraw(board) == false){
            gameBoard(board);
            System.out.println("Player " + player(player1) + " choose a box. Numbers 1-9 please");

            // Έλεγχος αμα επέλεξες έγκυρο πεδίο
            while (true){
                try {
                    boxPosition = boxChoice.nextInt();
                    while (board[boxPosition-1] != ' '){
                        if (board[boxPosition-1] != ' '){
                            System.out.println("This box is full please choose again");
                            boxPosition = boxChoice.nextInt();
                        }
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("You do not put a number. Please try again");
                    System.out.println("Player " + player(player1) + " choose a box. Numbers 1-9 please");
                    boxChoice.nextLine();
                }
            }

            //Εισαγωγή συμβούλου
            System.out.println("This box is empty");
            System.out.println("Putting a symbol, X for Player1, O for Player2");
            symbol = playerSymbolInput(player1);
            board[boxPosition - 1] = symbol;

            //Αλλαγή σειράς παίκτη
            player1=!player1;

        }

        //Εμφάνιση αποτελεσμάτων
        gameBoard(board);
        if (isDraw(board) == false){
            System.out.println("Congratulations. We have a winner");
            player1=!player1;
            playerWins(player1);
        }else {
            System.out.println("The game result is draw");
        }
        System.out.println("Game is over");
    }

    /**
     * Μέθοδος εμφάνισης table παιχνιδιού
     * @param board     Ο πίνακας οπού υπάρχουν τα στοιχειά του table
     */
    public static void gameBoard(char[]board){

        System.out.println();
        System.out.println("|---|---|---|");
        System.out.printf("| %c | %c | %c |%n",board[0],board[1],board[2]);
        System.out.println("|---|---|---|");
        System.out.printf("| %c | %c | %c |%n",board[3],board[4],board[5]);
        System.out.println("|---|---|---|");
        System.out.printf("| %c | %c | %c |%n",board[6],board[7],board[8]);
        System.out.println("|---|---|---|");
        System.out.println();

    }

    /**
     * Μέθοδος που ελέγχει ποιος παίζει
     * @param player1   μεταβλητή τύπου boolean
     * @return          αμα είναι true παίζει ο Player 1,
     *                  αλλιώς παίζει ο Player 2.
     */
    public static int player(boolean player1){
        if(player1 == true){
            return 1;
        }else {
            return 2;
        }
    }

    /**
     * Μέθοδος που επιστρέφει το σύμβολο που πρέπει να μπει στο πεδίο
     * @param player1   μεταβλητή τύπου boolean
     * @return          το σύμβολο που θα μπει στο πεδίο
     */
    public static char playerSymbolInput(boolean player1){
        if(player1 == true){
            return 'X';
        }else {
            return 'O';
        }
    }

    /**
     * Μέθοδος που δείχνει ποιος κέρδισε
     * @param player1   μεταβλητή τύπου boolean
     */
    public static void playerWins(boolean player1){
        if (player1 == true){
            System.out.println("Player 1 wins");
        }else {
            System.out.println("Player 2 wins");
        }
    }

    /**
     * Μέθοδος που ελέγχει αμα έγινε τρίλιζα
     * @param board     Πίνακας χαρακτήρων που αντιστοιχούν στα στοιχειά του table
     * @return          Τιμή boolean true αμα έγινε τρίλιζα, false αμα δεν έγινε
     */
    public static boolean istriliza(char[]board) {

        if ( ( board [0] == 'X' && board [1] == 'X' && board [2] == 'X' ) || ( board [0] == 'O' && board [1] == 'O' && board [2] == 'O' ) ) {
            return true;
        } else if ( ( board [3] == 'X' && board [4] == 'X' && board [5] == 'X' ) || ( board [3] == 'O' && board [4] == 'O' && board [5] == 'O' ) ) {
            return true;
        } else if ( (board [6] == 'X' && board [7] == 'X' && board [8] == 'X' ) || ( board [6] == 'O' && board [7] == 'O' && board [8] == 'O' ) ) {
            return true;
        } else if ( ( board [0] == 'X' && board [3] == 'X' && board [6] == 'X' ) || ( board[0] == 'O' && board[3] == 'O' && board[6] == 'O' ) ) {
            return true;
        }else if ( ( board[1] == 'X' && board[4] == 'X' && board[7] == 'X' ) || ( board[1] == 'O' && board[4] == 'O' && board[7] == 'O' ) ) {
            return true;
        }else if ( ( board[2] == 'X' && board[5] == 'X' && board[8] == 'X' ) || ( board[2] == 'O' && board[5] == 'O' && board[8] == 'O' ) ) {
            return true;
        }else if ( ( board[0] == 'X' && board[4] == 'X' && board[8] == 'X' ) || (board[0] == 'O' && board[4] == 'O' && board[8] == 'O' ) ) {
            return true;
        }else if( ( board[2] == 'X' && board[4] == 'X' && board[6] == 'X' ) || ( board[2] == 'O' && board[4] == 'O' && board[6] == 'O' ) ) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * Μέθοδος που ελέγχει αμα το παιχνίδι έληξε ισόπαλο
     * @param board     Πίνακας χαρακτήρων που αντιστοιχούν στα στοιχειά του table
     * @return          Τιμή boolean true αμα είναι ισοπαλία, false αμα δεν είναι ισοπαλία
     */
    public static boolean isDraw(char[]board){
        if ( board[0]!=' ' && board[1]!=' ' && board[2]!=' ' && board[3]!=' ' && board[4]!=' ' && board[5]!=' ' && board[6]!=' ' && board[7]!=' ' && board[8]!=' ') {
            return true;
        }else {
            return false;
        }
    }

}
