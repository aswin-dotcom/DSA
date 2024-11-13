class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m ;
        int  z=0;
        if (nums1.length <= 0) {
            return;

        } else {
            for (int i = k; k < nums1.length && z< nums2.length; k++) {

                 nums1[k]=nums2[z++];
            }
        }
        Arrays.sort(nums1);

    }
}