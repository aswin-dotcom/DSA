class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
                nums[i]=51;          
            }

        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums.length-count;

    }
}