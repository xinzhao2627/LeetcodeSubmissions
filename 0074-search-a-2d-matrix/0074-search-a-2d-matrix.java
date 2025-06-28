class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for (int i = 0; i < matrix.length; i++){
            int l = 0;
            int p = matrix[i].length - 1;
            while (l <= p){
                int mid = (l + p) / 2;
                if (matrix[i][mid] > target){
                    p = mid - 1;
                } else if (matrix[i][mid] < target){
                    l = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}