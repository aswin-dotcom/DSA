public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int,int> m =  new Dictionary<int,int>();
        for(int i=0; i<nums.Length;i++){
            int ans  =  target-nums[i];
            if(m.ContainsKey(ans)){
                return new int[]{m[ans],i};
            }else{
             m[nums[i]] = i;
            }
        }
        return new int[]{};

        
    }
}