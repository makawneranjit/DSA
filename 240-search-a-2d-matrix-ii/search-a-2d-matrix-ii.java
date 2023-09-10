class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        Approach:
        1. Travrse each row
        2. Apply binary search on each row 

        Time: O(m log n) | Space: O(1)

        */

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++) {
            int start = 0;
            int end = n-1;

            while(start <= end) {
                int mid = start + (end-start)/2;
                int element = matrix[i][mid];

                if(element == target)
                    return true;

                else if(element < target)
                    start = mid+1;

                else
                    end = mid-1; 
            }
        }

        return false; 
    }
}