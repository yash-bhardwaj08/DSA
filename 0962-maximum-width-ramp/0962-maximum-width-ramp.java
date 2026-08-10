class Solution {
    public int maxWidthRamp(int[] nums) {

        int n = nums.length;

        // Build suffix maximum array
        int[] maxRight = new int[n];

        maxRight[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(nums[i], maxRight[i + 1]);
        }

        int i = 0;
        int j = 0;
        int maxWidth = 0;

        while (i < n && j < n) {

            if (nums[i] <= maxRight[j]) {
                maxWidth = Math.max(maxWidth, j - i);
                j++;
            } 
            else {
                i++;
            }
        }

        return maxWidth;
    }
}