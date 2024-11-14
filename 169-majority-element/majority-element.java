class Solution {
    public int majorityElement(int[] nums) {
      int res=0;
      int major=0;
      HashMap<Integer,Integer> hasp=new HashMap<>();
      for(int n: nums){
        hasp.put(n,1+hasp.getOrDefault(n,0));
        if(hasp.get(n)>major){
            res=n;
            major=hasp.get(n);
        }
      }
      return res;



    }
}