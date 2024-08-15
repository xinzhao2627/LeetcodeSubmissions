using System;
using System.Text.RegularExpressions;

public class Solution {
    public string ReverseWords(string s) {
        string[] s_arr= Regex.Split(s.Trim(), "\\s+");
        Array.Reverse(s_arr);

        return string.Join(" ", s_arr);


    }
}