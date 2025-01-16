class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            if (height[start] < height[end]) {
                int len = end - start;
                int breadth = height[start];
                max = Math.max(max, len * breadth);
                len = 0;
                breadth = 0;
                start++;

            } else {
                int len = end - start;
                int breadth = height[end];
                max = Math.max(max, len * breadth);
                len = 0;
                breadth = 0;
                end--;

            }
        }
        return max;

    }
}