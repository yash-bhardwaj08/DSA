class Solution {
    public int numRescueBoats(int[] nums, int limit) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left <= right) {

            if (nums[right] == limit) {
                count++;
                right--;
                continue;
            }

            int sum = nums[left] + nums[right];

            if (sum <= limit) {       // changed == to <=
                count++;
                left++;
                right--;

            } else {
                count++;
                right--;
            }
        }

        return count;
    }
}