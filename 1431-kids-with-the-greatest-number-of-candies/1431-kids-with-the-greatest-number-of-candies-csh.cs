using System.Collections.Generic;
public class Solution {
    public IList<bool> KidsWithCandies(int[] candies, int extraCandies) {
        int max = candies.Max();
        List <bool> output = new List<bool>();

        for (int i = 0; i < candies.Length; i++)
        output.Add((candies[i] + extraCandies >= max) ? true : false);
        
        return output;
    }
}