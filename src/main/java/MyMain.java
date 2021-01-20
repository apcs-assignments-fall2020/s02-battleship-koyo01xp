public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        boolean check = false;
        if(board[row][col] == true){
            check = true;
        }
        else{
            check=false;
        }
        return check;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if(direction == "down"){
            int r = row;
            for(int x = r;x<boatLength+1;x++){
                board[x][col] = true;
            }
        }
        else if(direction == "right"){
            int c = col;
            for(int y = c;y<boatLength;y++){
                board[row][y] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        boolean check = false;
        for(int row = 0;row<words.length;row++){
            for(int col = 0;col<words[0].length-1;col++){
                
                String str = words[row][col];
                char ch = str.charAt(0);
                String str2 = words[row][col+1];
                char ch2 = str2.charAt(0);
                int x = str.length();
                int y = str2.length();
                if(ch>ch2 || x>y){
                    check = false;
                }
                else {
                    check = true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
