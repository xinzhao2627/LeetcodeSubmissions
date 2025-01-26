public class Solution {
    public void Rotate(int[][] matrix) {
        int n = matrix.Length;
        int l = 0, r = n-1, t = 0, b = n-1;
        while (l < r){
            for (int i = 0; i < r-l; i++ ){
                int topLeft = matrix[t][l+i];
                matrix[t][l+i] = matrix[b-i][l];
                matrix[b-i][l] = matrix[b][r-i];
                matrix[b][r-i] = matrix[t+i][r];
                matrix[t+i][r] = topLeft;
            }
            l++;
            r--;
            t++;
            b--;
        }
    }
}