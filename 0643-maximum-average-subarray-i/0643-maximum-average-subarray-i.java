class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        for(int i= 0; i<k; i++){
            sum  += nums[i];
        }
        maxLen = sum;
        for(int right = k; right<nums.length; right++){

            sum = sum - nums[left] + nums[right]; 
            left++;
            maxLen = Math.max(maxLen, sum);
        }
        return (double) maxLen/k;
    }
}