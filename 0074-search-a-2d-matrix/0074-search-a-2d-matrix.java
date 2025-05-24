class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int i =0, j = matrix.length-1;
        int n = matrix[0].length - 1;
        // System.out.println(n);
        while (i <= j){
            int mid = (i + j )/ 2;
            if (matrix[mid][0] <= target && matrix[mid][n] >= target){
                int x = 0, y = n;
                while (x <= y){
                    int m2 = (x+y)/2;
                    if (matrix[mid][m2] > target){
                        y = m2 -1;
                    } else if (matrix[mid][m2] < target){
                        x = m2+1;
                    } else{
                        return true;
                    }
                }
                return false;
            } else if (matrix[mid][0] > target){
                // System.out.println("trun");
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }
}