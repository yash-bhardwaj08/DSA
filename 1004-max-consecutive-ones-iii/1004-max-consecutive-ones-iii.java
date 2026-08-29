class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int countZeroes = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0) countZeroes++;

            while(countZeroes > k){
                if(nums[left] == 0){
                    countZeroes--;
                }
                left++;
            }

            if (countZeroes <= k){
                    int len = i - left + 1;
                    maxLen = Math.max(maxLen, len);
            }
            
        }
    return maxLen;
    }
}