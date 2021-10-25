import java.util.Random;
import java.util.Scanner;
public class coonect4byComputer {

    private static int lastCol = -1;
    private static int lastTop = -1;
    public static char[][] board  = {	{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '} };
   
	public coonect4byComputer() {
	
	}
    public int BoardFunc(char[][] board) {
        System.out.println(" ======================");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i);
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j] + " |");
            }
            System.out.println();
            System.out.println(" ======================");
           
        }
        System.out.print("  ");
        for (int i = 0; i <= board.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
		return 0;
    }
  
    //this function will place the elements dics at the bottom of the matrix or fill a particular column
    public static boolean columnFunc(char[][] board, char symbol, int col) {
        boolean flag;

        do {
            //inserting elements in the first row
            for (int i = board.length - 1; i >= 0; i--) {
                if (board[i][col] == ' ') {
                    board[lastTop = i][lastCol = col] = symbol;
                    System.out.println("--> Player has placed a his disc in row " + i + ", column " + col + " .");

                    return true;

                }
            }
            // if column is full we ask the user to enter a new input
            System.out.println("Column " + col + " is full.");
            flag = false;
            break;
        } while (true);
        return flag;
    }
 
    //this function will return who he the winner 
    public static char Winnerfunc(char[][] board) {

        //Check each row
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] == board[i][3] && board[i][0] != ' ') {
                return board[i][0];
            }
            if (board[i][3] == board[i][4] && board[i][4] == board[i][5] && board[i][5] == board[i][6] && board[i][3] != ' ') {
                return board[i][3];
            }
            if (board[i][1] == board[i][2] && board[i][2] == board[i][3] && board[i][3] == board[i][4] && board[i][1] != ' ') {
                return board[i][1];
            }
            if (board[i][2] == board[i][3] && board[i][3] == board[i][4] && board[i][4] == board[i][5] && board[i][2] != ' ') {
                return board[i][2];
            }
        }
        //Check each column
        for (int j = 0; j < board.length-1; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[2][j] == board[3][j] && board[0][j] != ' ') {
                return board[0][j];
            }
            if (board[1][j] == board[2][j] && board[2][j] == board[3][j] && board[3][j] == board[4][j] && board[1][j] != ' ') {
                return board[1][j];
            }
            if (board[2][j] == board[3][j] && board[3][j] == board[4][j] && board[4][j] == board[5][j] && board[3][j] != ' ') {
                return board[3][j];
            }
        }

        //Check the diagonals for first left
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == board[3][3] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][1] == board[1][2] && board[1][2] == board[2][3] && board[2][3] == board[3][4] && board[0][1] != ' ') {
            return board[0][1];
        }
        if (board[0][2] == board[1][3] && board[1][3] == board[2][4] && board[2][4] == board[3][5] && board[0][2] != ' ') {
            return board[0][2];
        }
        if (board[0][3] == board[1][4] && board[1][4] == board[2][5] && board[2][5] == board[3][6] && board[0][3] != ' ') {
            return board[0][3];
        }
        //check the diagonals  first right
        if (board[0][6] == board[1][5] && board[1][5] == board[2][4] && board[2][4] == board[3][3] && board[0][6] != ' ') {
            return board[0][6];
        }
        if (board[0][5] == board[1][4] && board[1][4] == board[2][3] && board[2][3] == board[3][2] && board[0][5] != ' ') {
            return board[0][5];
        }
        if (board[0][4] == board[1][3] && board[1][3] == board[2][2] && board[2][2] == board[3][1] && board[0][4] != ' ') {
            return board[0][4];
        }
        if (board[0][3] == board[1][2] && board[1][2] == board[2][1] && board[2][1] == board[3][0] && board[0][3] != ' ') {
            return board[0][3];
        }
        //Check the diagonals for bottom left
        if (board[5][6] == board[4][5] && board[4][5] == board[3][4] && board[3][4] == board[2][3] && board[5][6] != ' ') {
            return board[5][6];
        }
        if (board[5][5] == board[4][4] && board[4][4] == board[3][3] && board[3][3] == board[2][2] && board[5][5] != ' ') {
            return board[5][5];
        }
        if (board[5][4] == board[4][3] && board[4][3] == board[3][2] && board[3][2] == board[2][1] && board[5][4] != ' ') {
            return board[5][4];
        }
        if (board[5][3] == board[4][2] && board[4][2] == board[3][1] && board[3][1] == board[2][0] && board[5][3] != ' ') {
            return board[5][3];
        }
        //check the diagonals  bottom right
        if (board[5][0] == board[4][1] && board[4][1] == board[3][2] && board[3][2] == board[2][3] && board[5][0] != ' ') {
            return board[5][0];
        }
        if (board[5][1] == board[4][2] && board[4][2] == board[3][3] && board[3][3] == board[2][4] && board[5][1] != ' ') {
            return board[5][1];
        }
        if (board[5][2] == board[4][3] && board[4][3] == board[3][4] && board[3][4] == board[2][5] && board[5][2] != ' ') {
            return board[5][2];
        }
        if (board[5][3] == board[4][4] && board[4][4] == board[3][5] && board[3][5] == board[2][6] && board[5][3] != ' ') {
            return board[5][3];
        }
        //Check the diagonals for middle elements left
        if (board[1][0] == board[2][1] && board[2][1] == board[3][2] && board[3][2] == board[4][3] && board[1][0] != ' ') {
            return board[1][0];
        }
        if (board[1][1] == board[2][2] && board[2][2] == board[3][3] && board[3][3] == board[4][4] && board[1][1] != ' ') {
            return board[1][1];
        }
        if (board[1][2] == board[2][3] && board[2][3] == board[3][4] && board[3][4] == board[4][5] && board[1][2] != ' ') {
            return board[1][2];
        }
        if (board[1][3] == board[2][4] && board[2][4] == board[3][5] && board[3][5] == board[4][6] && board[1][3] != ' ') {
            return board[1][3];
        }
        //check the diagonals for the middle elements right
        if (board[1][3] == board[2][2] && board[2][2] == board[3][1] && board[3][1] == board[4][0] && board[1][3] != ' ') {
            return board[1][3];
        }
        if (board[1][4] == board[2][3] && board[2][3] == board[3][2] && board[3][2] == board[4][1] && board[1][4] != ' ') {
            return board[1][4];
        }
        if (board[1][5] == board[2][4] && board[2][4] == board[3][3] && board[3][3] == board[4][2] && board[1][5] != ' ') {
            return board[1][5];
        }
        if (board[1][6] == board[2][5] && board[2][5] == board[3][4] && board[3][4] == board[4][3] && board[1][6] != ' ') {
            return board[1][6];
        }
        //Otherwise nobody has not won yet
        return ' ';

    }

    //to check weather board is full or not
    public static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void BoardEmptyFunc(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public int commove(char[][] board,char player) {
    	for (int i = 0; i < board.length; i++) {
    		for (int j = 0; j < board[0].length-3; j++) {
    			 if (board[i][j] == player && board[i][j+1] == player && board[i][j+2] == player && board[i][j+3] == ' ') {
                  return j+3;
               }
    			 if (board[i][j] == ' ' && board[i][j+1] == player && board[i][j+2] == player && board[i][j+3] == player) {
                     return j;
                  }
    		}
    	}
//    	 for (int i = 0; i < board.length-1; i++) {
//             if (board[i][0] == player  && board[i][1] == player && board[i][2] == player && board[i][3] == ' ' ) {
//                 return i;
//             }
//             if ((board[i][3] == player || board[i][3] ==' ')&& board[i][4] == player && board[i][5] == player && (board[i][6] == ' ' || board[i][6] == player )) {
//                 return i;
//             }
//             if ((board[i][1] == player || board[i][1] ==' ')&& board[i][2] == player && board[i][3] == player && (board[i][4] == ' ' || board[i][4] == player )) {
//                 return i;
//             }
//             if ((board[i][2] == player || board[i][2] ==' ')&& board[i][3] == player && board[i][4] == player && (board[i][5] == ' ' || board[i][5] == player )) {
//                 return i;
//             }
//         }
    	 //col blocking
    	
         for (int j = 0; j < board.length; j++) {
             if (board[5][j] == player && board[4][j] == player && board[3][j] == player && board[2][j] == ' ' ) {
                 return j;
             }
             if (board[4][j] == player && board[3][j] == player && board[2][j] == player && board[1][j] == ' '  ) {
                 return j;
             }
             if (board[3][j] == player && board[2][j] == player && board[1][j] == player && board[0][j] == ' ' ) {
                 return j;
             }
         }
		return -1;
    
    }
    public int bestValue(char[][] board,char symbol) {
		Random rd = new Random();
			int value = commove(board,symbol);
			if(value == -1) {
				int rand =  rd.nextInt(7);
				return rand;
			} else {
				return value;
			}
	}
    public static void main(String[] args) {

    	//creating Board matrix 6*7
    			
        coonect4byComputer obj = new coonect4byComputer();
     
        obj.BoardFunc(board);
        //taking inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a colour Blue (B) or Green (G)");
        System.out.print("Enter Player1 name who want BLUE:");
        String p1 = input.nextLine();
        System.out.println("Player2 is COMPUTER");

        boolean player1 = true;
        boolean gameEnded = false;

        while (!gameEnded) {
            obj.BoardFunc(board);
            if (player1) {
                System.out.println(p1 + "'s Turn:");
            } else {
                System.out.println("computer's Turn:");
            }
            char c = '-';
            if (player1) {
                c = 'B';
            } else {
                c = 'G';
            }

            char symbol = c;
            int row = 0;
            int col = 0;
            while (true) {
                if (player1) {
                    System.out.println("Choose a token that you want to insert into a column:");
                    if (input.hasNextInt()) {
                        col = input.nextInt();
                        if (col >= 0 && col < 7) {
                            // we ask user to choose a column by calling columnFunc
                            if (!columnFunc(board, symbol, col)) {
                                System.out.println("choose other column number");
                                continue;
                            }

                        } else {
                            System.out.println("Column must be between 0 and " + board.length + " .out of range");
                            continue;
                        }
                    } else {
                        System.out.println("input is not valid");
                        input.next();
                        continue;
                    }

                    break;

                } else {

                	int comcol = obj.bestValue(board,'B');
                    //int comcol = (int)(Math.random() * 7);
                    System.out.println("Computer choosen " + comcol + " column");
                    if (comcol >= 0 && comcol < 7) {
                        // we ask user to choose a column by calling columnFunc
                        if (!columnFunc(board, symbol, comcol)) {
                            System.out.println("choose other column number");
                            continue;
                        }

                    } else {
                        System.out.println("Column must be between 0 and " + board.length + " .out of range");
                        continue;
                    }


                    break;
                }
            }

            if (Winnerfunc(board) == 'B') {
                System.out.println(p1 + " wins!");
                obj.BoardFunc(board);
              
                System.out.println("Do you want to play again enter 'yes' to 'no'");
              
                String playagain = input.next();
       

                if (playagain.equals("yes")) {
                    gameEnded = false;
                    obj.BoardEmptyFunc(board);

                }
                if (playagain.equals("no")) {
                    System.out.println("======GAME ENDED======");
                    gameEnded = true;
                    
                }
            } else if (Winnerfunc(board) == 'G') {
                System.out.println("computer wins!");
                obj.BoardFunc(board);
                System.out.println("Do you want to play again enter 'yes' to 'no'");
                String playagain = input.next();

                if (playagain.equals("yes")) {
                    gameEnded = false;
                    obj.BoardEmptyFunc(board);

                }
                if (playagain.equals("no")) {
                    System.out.println("======GAME ENDED======");
                    gameEnded = true;

                }
            } else {
                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    System.out.println("Do you want to play again enter 'yes' or 'no'");
                    String playagain = input.next();
                    if (playagain.equals("yes")) {
                        gameEnded = false;
                        obj.BoardEmptyFunc(board);

                    }
                    if (playagain.equals("no")) {
                        System.out.println("======GAME ENDED======");
                        gameEnded = true;

                    }


                } else {
                    player1 = !player1;
                }

            }

        }
    }

}