

public class Solution {
    public int LengthOfLastWord(String s) {
       string[] arr= s.Split(' ',StringSplitOptions.RemoveEmptyEntries);
      return arr.Length > 0 ? arr[^1].Length : 0;

        
    }
}