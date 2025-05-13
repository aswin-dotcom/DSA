class Solution {
    public boolean containsDuplicate(int[] nums) {
     Map<Integer,Integer> m =  new HashMap();
     for(int i=0;i<nums.length;i++){
        if(m.containsKey(nums[i])){
            return true;
        }else{
            m.put(nums[i],nums[i]);
        }
     }
     return false;
        
    }
}