import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.Parameters;

class coonect4byComputerTest {
	
	char[][] board1 = {	{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '},
			{' ', ' ', ' ', ' ', ' ',' ',' '} };
	private static final int COLUMN_COUNT = 7;
    private static final int ROW_COUNT = 6;
   
    @Test
    public void Boardd_func() {
    	coonect4byComputer test = new coonect4byComputer();
    	
         char[] row0 = {' ', ' ', ' ', ' ', ' ',' ',' '}; // This represents values in  row 0
         char[] row1 = {' ', ' ', ' ', ' ', ' ',' ',' '}; // row 1
         char[] row2 = {' ', ' ', ' ', ' ', ' ',' ',' '}; // row 2
         char[] row3 = {' ', ' ', ' ', ' ', ' ',' ',' '}; // row 3
         char[] row4 = {' ', ' ', ' ', ' ', ' ',' ',' '}; // row 4
         char[] row5 = {' ', ' ', ' ', ' ', ' ',' ',' '}; // row 5
         assertArrayEquals(row0, test.board[0]);
         assertArrayEquals(row1, test.board[1]);
         assertArrayEquals(row1, test.board[2]);
         assertArrayEquals(row1, test.board[3]);
         assertArrayEquals(row1, test.board[4]);
         assertArrayEquals(row1, test.board[5]);
    } 

    @Test
    public void Board_Full() {
    	
    	coonect4byComputer test1 = new coonect4byComputer();
    	char [][] b1 = test1.board;
    		for(int i =0 ;i<board1.length;i++) {
    			for(int j = 0;j<board1[i].length;j++) {
    				b1[i][j]  = ' ' ;
    			}
    		}
    	assertFalse(test1.boardIsFull(b1));
    }

   
}
