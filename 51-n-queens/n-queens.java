class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        String temp="";
        for(int i=0; i<n; i++)
            temp += ".";
        
        //create & initialize chess board
        List<String> board = new ArrayList<String>(); 
        for(int i=0; i<n; i++)
            board.add(temp); 

        //return ans 
        int row = 0;
        solve(row, n, board); 
        return ans; 
    }

    //Recursive function to place n queens on chess board
    private void solve(int row, int n, List<String> board) {
        //base case
        if(row == n) {
            ans.add(new ArrayList<>(board));
            return; 
        }

        for(int j=0; j<n; j++) {
            //check if position is safe to place a queen, if yes then place a queen
            if(isSafe(row, j, board, n)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(j, 'Q');
                board.set(row, sb.toString()); 

                //call recursion to place queens for next row
                solve(row+1, n, board);

                //backtrack
                sb.setCharAt(j, '.');
                board.set(row, sb.toString()); 
            }
        }
    }

    //function to check if poition is safe to place queen
    private boolean isSafe(int row, int col, List<String> board, int n) {

        //take temp variable to check so that we can not change row & j var received as input and use same again in func
        int x = row;
        int y = col;

        //1. check left diagonal
        while(x >=0 && y >= 0) {
            if(board.get(x).charAt(y) == 'Q')
                return false; 
            x--;
            y--; 
        }

        //2. check uppermost elements
        x = row;
        y = col; 
        while(x >= 0) {
            if(board.get(x).charAt(y) == 'Q')
                return false; 
            x--;
        }

        //3. check right diagonal
        x = row;
        y = col; 
        while(x >=0 && y < n) {
            if(board.get(x).charAt(y) == 'Q')
                return false; 
            x--;
            y++; 
        }

        return true; 
    }
}