public class Solution {
    public bool IsSubsequence(string s, string t) {
        int i = 0;// index for s string ;
        int j = 0;// index for t string
        while(i<s.Length && j<t.Length)
        {
            if(s[i]==t[j])
            {
                i++;
            }
            j++;

        }
        return i==s.Length;
  
        
    }
}