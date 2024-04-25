class Solution {
    public int longestSubarray(int[] nums) {
        int largest = 0, x = 0, y =0, p = 1, k = 1;
        ArrayList<Integer> z= new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                x++;
                y++;
            } else if (p > 0){ // if 0 and still has pots
                z.add(++y);
                x++;
                y=0;
                p--;
            } else if (k != 0){ // if no pots left and nums[i] is 0
                largest = (x > largest) ? x : largest;
                int val = 0;
                val = z.get(0);
                z.remove(0);
                x += 1 - val ;
                z.add(++y);
                y = 0;
            } else{
                largest = (x > largest) ? x : largest;
                x = 0;
            }
        }

        return (x>largest) ? x-1 : largest-1;
    }
}