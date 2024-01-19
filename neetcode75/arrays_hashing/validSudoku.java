import java.util.ArrayList;
import java.util.HashMap;

public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        // create 27 hashmaps
        //HashMap<Character, Integer>[] row = new HashMap[9];
        ArrayList<HashMap<Character, Integer[]>> colList = new ArrayList<>();
        HashMap<Character, Integer>[] col1 = new HashMap[9];
        HashMap<Character, Integer>[] col2 = new HashMap[9];
        HashMap<Character, Integer>[] col3 = new HashMap[9];
        HashMap<Character, Integer>[] col4 = new HashMap[9];
        HashMap<Character, Integer>[] col5 = new HashMap[9];
        HashMap<Character, Integer>[] col6 = new HashMap[9];
        HashMap<Character, Integer>[] col7 = new HashMap[9];
        HashMap<Character, Integer>[] col8 = new HashMap[9];
        HashMap<Character, Integer>[] col9 = new HashMap[9];
        colList.add(0, col1);
        


        ArrayList<HashMap<Character, Integer>> rowList = new ArrayList<>();
        HashMap<Character, Integer>[] row1 = new HashMap[9];
        HashMap<Character, Integer>[] row2 = new HashMap[9];
        HashMap<Character, Integer>[] row3 = new HashMap[9];
        HashMap<Character, Integer>[] row4 = new HashMap[9];
        HashMap<Character, Integer>[] row5 = new HashMap[9];
        HashMap<Character, Integer>[] row6 = new HashMap[9];
        HashMap<Character, Integer>[] row7 = new HashMap[9];
        HashMap<Character, Integer>[] row8 = new HashMap[9];
        HashMap<Character, Integer>[] row9 = new HashMap[9];

        ArrayList<HashMap<Character, Integer>> boxList = new ArrayList<>();
        HashMap<Character, Integer>[] box1 = new HashMap[9];
        HashMap<Character, Integer>[] box2 = new HashMap[9];
        HashMap<Character, Integer>[] box3 = new HashMap[9];
        HashMap<Character, Integer>[] box4 = new HashMap[9];
        HashMap<Character, Integer>[] box5 = new HashMap[9];
        HashMap<Character, Integer>[] box6 = new HashMap[9];
        HashMap<Character, Integer>[] box7 = new HashMap[9];
        HashMap<Character, Integer>[] box8 = new HashMap[9];
        HashMap<Character, Integer>[] box9 = new HashMap[9];




        //HashMap<Character, Integer>[] box = new HashMap[9];


        // when iterating down the rows, though eacch column
        for (int i = 0; i < board.length; i++) {
            // each row you create a hashmap
            for (int j = 0; j < board[0].length; j++) {
                int r = i;
                int c = j;
                char key = board[i][j];
                if (key != '.') {
                    
                }
                    
            }
        }
    }
}
