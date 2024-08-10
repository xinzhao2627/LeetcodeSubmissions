
public class Solution {
    public string GcdOfStrings(string str1, string str2) {
        string output = "";
        string cd = "";
        if (str1[0] != str2[0]) return output;
        
        int i = 0;
        string str3 = (str1.Length > str2.Length)? str2 : str1;
        while (i < str3.Length){
            cd += str3[i++].ToString();
            string[] ans1 = str1.Split(new string[] {cd}, System.StringSplitOptions.None);
            string[] ans2 = str2.Split(new string[] {cd}, System.StringSplitOptions.None);
            Console.WriteLine(cd);
            Console.WriteLine(string.Join("",ans1).Length + " and " + string.Join("",ans2).Length);
            Console.WriteLine(ans1.Length);
            Console.WriteLine(ans2.Length);
            output = (string.Join("",ans1).Length == 0 && string.Join("",ans2).Length == 0) ? cd : output;
        }
        Console.WriteLine("wdw "+output);
        return output;
    }
}