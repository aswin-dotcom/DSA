class Solution {
    public int removeDuplicates(int[] nums) {
       int index=1;
       int correctindex=0;
       while(index<nums.length){
            if(nums[index]!=nums[index-1]){
                correctindex++;
                nums[correctindex]=nums[index];
            }
            index++;
       }
       return correctindex+1;


    }
}
