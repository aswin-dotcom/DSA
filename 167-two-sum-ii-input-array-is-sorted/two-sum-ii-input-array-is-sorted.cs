public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
           int left = 0;
            int right = numbers.Length-1;
        while(left<right)
        {
            int total = numbers[left]+numbers[right];
            if(total==target)
            {
                return new int[]{left+1,right+1};
            }
            else if(total<target)
            {
                left++;

            }
            else{
                right--;
            }

        }
        return new int[]{-1,-1};
     
        
    }
}