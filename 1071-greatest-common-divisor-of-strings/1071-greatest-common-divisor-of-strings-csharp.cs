
public class Solution {
    public string GcdOfStrings(string str1, string str2) {
        string output = "";
        string cd = "";
        if (str1[0] != str2[0]) return output;
        
        int i = 0;
        string str3 = (str1.Length > str2.Length)? str2 : str1;
        while (i < str3.Length){
            cd += str3[i++].ToString();
            output = (
                string.Join("",
                    str1.Split(new string[] {cd}, System.StringSplitOptions.None)).Length == 0 
                && string.Join("",
                    str2.Split(new string[] {cd}, System.StringSplitOptions.None)).Length == 0) 
                ? cd 
                : output;
        }

        return output;
    }
}