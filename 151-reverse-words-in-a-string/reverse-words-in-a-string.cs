public class Solution {
    public string ReverseWords(string s) {
        String[] arr =s.Split(" ",StringSplitOptions.RemoveEmptyEntries);
        String str="";
        for(int i=arr.Length-1;i>0;i--){
            if(arr[i]!=""){
                   str+=arr[i]+" ";

            }
         


        }
        return str+arr[0];
    }
}