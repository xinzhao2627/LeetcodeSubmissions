public class Solution {
    public string MergeAlternately(string word1, string word2) {
        // while (String.indexOf())
        int i = 0;
        string word3 = "";
        while (i < word1.Length && i < word2.Length){
            word3 +=word1[i].ToString() + word2[i++].ToString();
        }
        return word3 + ((word1.Length > word2.Length) ? word1.Substring(i) : word2.Substring(i));
    }
}