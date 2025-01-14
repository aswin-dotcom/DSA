public class Solution {
    public bool IsPalindrome(string s) {
        

        int first = 0;
        int last = s.Length-1;

        while(first<=last)
        {
             char  start = s[first];
             char end = s[last];
             if(!char.IsLetterOrDigit(start))
             {
                first++;
             }else if(!char.IsLetterOrDigit(end))
             {
                last--;

             }
             else{
                if(char.ToLower(start)!=(char.ToLower(end))){
                    return false;

                }
                first++;
                last--;

             }

        }
        return true;








        
    }
}