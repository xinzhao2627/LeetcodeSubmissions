public class Solution {
    public bool CanPlaceFlowers(int[] flowerbed, int n) {
        
        if (flowerbed.Length == 1){
            if (flowerbed[0] == 0 && n <= 1) return true;
            else if (flowerbed[0] == 1 && n == 0) return true;
            else return false;
        }
        int prev = -1;
        for (int i = 0; i < flowerbed.Length-1; i ++){
            if (n == 0) return true;



            // if between two zero
            if (flowerbed[i] == 0 && prev == 0 && flowerbed[i+1] == 0){
                prev = 1;
                n -= 1;
            }else if (prev == -1 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                prev = 1;
                n-=1;
            }
            else {
                prev = flowerbed[i];
            }
        }
        if (prev == 0 && flowerbed[flowerbed.Length-1] == 0) n-=1;


        return (n==0) ? true : false;
    }
}