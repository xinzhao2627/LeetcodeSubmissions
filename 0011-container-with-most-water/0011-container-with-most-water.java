class Solution {
    public int maxArea(int[] height) {
        int i = 0, a = 0, area = 0; 
        int j = height.length - 1;

        while (i < j && j > i){
            a = (height[i] < height[j]) 
                ? height[i] * (j - i)
                : height[j] * (j - i);
            area = (a > area) 
                ? a
                : area;
            if (height[i] < height[j]) i++;
            else j--;
        }
        return area;
    }
}