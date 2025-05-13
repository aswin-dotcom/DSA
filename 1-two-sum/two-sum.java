class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> m = new HashMap();
       for(int i=0;i<nums.length;i++){
          int ans  =  target-nums[i];
          if(m.containsKey(ans)){
            return new int[] {m.get(ans),i};
          }else{
            m.put(nums[i],i);
          }
       }

       return new int[]{};
        
    }
}