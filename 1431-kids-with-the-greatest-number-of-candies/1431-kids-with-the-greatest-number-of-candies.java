import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> results = new ArrayList<Boolean>();
        int highest_candy = 0;
        for (int candy : candies){
            if (candy > highest_candy){
                highest_candy = candy;
            }
        }
        for (int i = 0; i < candies.length; i++){
            if ((candies[i] + extraCandies) >= highest_candy){
                results.add(true);
            } else {
                results.add(false);
            }
        }
        return results;
    }
}