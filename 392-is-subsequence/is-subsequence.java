class Solution {
    public boolean isSubsequence(String s, String t) {
         int i = 0 ;//index for s string;
         int j = 0 ;//index for t string
         while(i<s.length() && j < t.length())
         {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;

            }
            j++;
         }
         return i==s.length();

    }
}