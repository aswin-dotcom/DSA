class Solution {
    public int strStr(String haystack, String needle) {
        
     int count = haystack.indexOf(needle);
     if(count>=0){
        return count;
     }
     return -1;
        
    }
}