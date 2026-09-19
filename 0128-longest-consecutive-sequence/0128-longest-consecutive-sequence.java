
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxLen = 0;

        for (int num : set) {

            if (set.contains(num - 1)) {
                continue;
            }

            int curr = num;
            int count = 1;

            while (set.contains(curr + 1)) {
                curr++;
                count++;
            }

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}