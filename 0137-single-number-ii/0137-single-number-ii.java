/*class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}*/
/*
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i += 3){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
    return nums[nums.length - 1];
    }
}*/
class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        // Check every bit position (0 to 31)
        for (int i = 0; i < 32; i++) {

            int count = 0;

            // Count how many numbers have ith bit set
            for (int j = 0; j < nums.length; j++) {

                if ((nums[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            // If count is not a multiple of 3,
            // this bit belongs to the unique number
            if (count % 3 != 0) {
                ans = ans | (1 << i);
            }
        }

        return ans;
    }
}