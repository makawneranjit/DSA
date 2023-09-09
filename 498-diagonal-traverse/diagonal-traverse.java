class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //total diagonals = m + n - 1; 

        /* Approach: 
        1. traverse all the diagonals
        2. for each iteration start one for loop for row (i = 0, <d)
        3. for each i th row find col = d-i; 
        4. print i th and j th value

        */

        int m = mat.length;
        int n = mat[0].length; 

        int [] ans = new int[m*n];

        int k = 0; 
        for(int d = 0; d < m+n-1; d++) {
            for(int i=0; i<= d; i++) {
                int j = d - i;

                //only valid index to be accessed & d odd means go downward direction
                if(i<m && j<n && d%2 != 0)  {
                    ans[k] = mat[i][j];
                    k++;
                }      

                //only valid index to be accessed & d even means go upward direction       
                else if(j<m && i<n && (d%2 == 0)) {
                    ans[k] = mat[j][i];
                    k++; 
                }       
                
            }
        }

        return ans; 
    }
}