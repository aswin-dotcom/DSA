class Solution {
    public String convert(String s, int numRows) {
        char[][] arr= new char[numRows][s.length()];
        int rows=0;
        int columns=0;
        int currentindex=0;
        while(currentindex<s.length())
        {
            while(rows<numRows  && currentindex<s.length())
            {
                arr[rows++][columns]=s.charAt(currentindex++);
            }
            rows=Math.max(0,rows-2);
            while(rows>0 && currentindex<s.length())
            {
                arr[rows--][++columns]=s.charAt(currentindex++);

            }
            columns+=1;


        }
        String ans="";
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<s.length();j++){
                
                if(arr[i][j]!='\u0000' ){
                      ans+=arr[i][j];

                }
                  

            

                // ans+=arr[i][j];
            }
        }
        return ans;
        
    }
}