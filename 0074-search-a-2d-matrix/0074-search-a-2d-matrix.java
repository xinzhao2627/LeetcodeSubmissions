class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] <= target && matrix[i][n-1] >= target){
                int left = 0;
                int right = n-1;

                while (left <= right){
                    int middle = (left + right) /2;
                    int num = matrix[i][middle];

                    if (num > target) {
                        right = middle -1;
                    } else if (num < target) {
                        left = middle + 1;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}