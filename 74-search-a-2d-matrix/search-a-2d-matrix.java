class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        /* Approach: Apply binary search 
        
        1. Apply binary seach on col to find the row.
        2. Apply binary search on row to find the target

        Time: O(long m + log n) | Space : (1) */

        //traverse each row
        int m = matrix.length;
        int n = matrix[0].length; 

        for(int i=0; i<m; i++) {

            //on each row apply binary search
            if(target >= matrix[i][0] && target <= matrix[i][n-1]) {
                int start = 0;
                int end = n-1;
                
                while(start <= end) {
                    int mid = start + (end-start)/2;

                    if(matrix[i][mid] == target)
                        return true;

                    else if(matrix[i][mid] > target)
                        end = mid-1; 

                    else
                     start = mid+1; 
                }  
            }
        }

        return false; 
    }

}