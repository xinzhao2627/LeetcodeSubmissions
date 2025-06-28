class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int l = 0, t = 0, b = n, r = n;

        while(l < r){
            // System.out.println("trigger");
            for (int i = 0; i < r-l; i++){
                int topLeft = matrix[t][l+i];
                matrix[t][l+i] = matrix[b-i][l];
                matrix[b-i][l] = matrix[b][r-i];
                matrix[b][r-i] = matrix[t+i][r];
                matrix[t+i][r] = topLeft;
                // System.out.println(topLeft);
            }
            l++;
            t++;
            b--;
            r--;
        } 
    }
}