class Solution {
    public int plant(int[] flowerbed, int n, int c, int prev, int cur){
        int flower = cur;
        if (c == flowerbed.length-1 || n == 0) {//if you are at the end of the array
            if ((prev == -1 || prev == 0) && flower == 0){
                n -= 1;
            }
            return n;
        }
        if (cur == 0 && flowerbed[c+1] == 0 && (prev == -1 || prev == 0)){
            return plant(flowerbed, n-1, ++c, 1, flowerbed[c]);
        } else {
            return plant(flowerbed, n, ++c, flower, flowerbed[c]);
        }
    }

    public boolean placer(int[] flowerbed, int n){
        if (n == 0) return true;
        int result = plant(flowerbed, n, 0, -1, flowerbed[0]);
        if (result != 0) return false;
        return true; 
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        return placer(flowerbed, n);
    }

}