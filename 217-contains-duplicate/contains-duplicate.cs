public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        Dictionary<int,int> m =  new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
            if(m.ContainsKey(nums[i])){
                return true;
            }else{
                m[nums[i]]=nums[i];
            }
        }
        return false;
    }
}