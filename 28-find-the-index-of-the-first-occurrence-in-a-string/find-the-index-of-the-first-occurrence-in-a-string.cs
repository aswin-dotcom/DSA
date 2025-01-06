public class Solution {
    public int StrStr(string haystack, string needle) {
        int count =  haystack.IndexOf(needle);
        return count>=0?count:-1;
       
    }
}