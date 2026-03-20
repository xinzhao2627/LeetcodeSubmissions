class Solution {
    public void rotate(int[][] matrix) {
        int left = 0, top = 0;
        int right = matrix.length - 1, bottom = matrix.length - 1;

        while (left < right){
            for (int i = 0; i < right - left; i++){
                int topLeft = matrix[top][left+i];
                matrix[top][left+i] = matrix[bottom-i][left];
                matrix[bottom-i][left] = matrix[bottom][right-i];
                matrix[bottom][right-i] = matrix[top+i][right];
                matrix[top+i][right] = topLeft;
            }
            left++;
            top++;
            right--;
            bottom--;
        }
    }
}