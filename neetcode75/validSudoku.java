import java.util.ArrayList;
import java.util.HashMap;

public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        // create 27 hashmaps
        //HashMap<Character, Integer>[] row = new HashMap[9];
        HashMap<Character, Integer>[] hmColArray = new HashMap[9];
        for (int i = 0; i < hmColArray.length; i++) {
            hmColArray[i] = new HashMap<Character, Integer>();
        }
  
        HashMap<Character, Integer>[] hmRowArray = new HashMap[9];
        for (int i = 0; i < hmRowArray.length; i++) {
            hmRowArray[i] = new HashMap<Character, Integer>();
        }

        HashMap<Character, Integer>[] hmBoxArray = new HashMap[9];
        for (int i = 0; i < hmBoxArray.length; i++) {
            hmBoxArray[i] = new HashMap<Character, Integer>();
        }
        // when iterating down the rows, though eacch column
        for (int i = 0; i < board.length; i++) {
            // each row you create a hashmap
            for (int j = 0; j < board[0].length; j++) {
                int r = i;
                int c = j;
                char key = board[i][j];
                if (key != '.') {
                    // check ColArray
                    if (hmColArray[c].containsKey(key)) {
                        return false;
                    } else {
                        hmColArray[c].put(key, 1);
                    }
                    // check RowArray
                    if (hmRowArray[r].containsKey(key)) {
                        return false;
                    } else {
                        hmRowArray[r].put(key, 1);
                    }
                    // check BoxArray
                    int box = (int) ((Math.floor((double)r/3))*3 + Math.floor((double)c/3));
                    if (hmBoxArray[box].containsKey(key)) {
                        return false;
                    } else {
                        hmBoxArray[box].put(key, 1);
                    }
                }
                    
            }
        }
        return true;
    }
}
