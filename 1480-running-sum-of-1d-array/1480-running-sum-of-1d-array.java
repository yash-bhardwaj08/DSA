class Solution {
    public int[] runningSum(int[] nums) {

        int[] output = new int[nums.length];

        if(nums.length == 0){
            return output;
        }
        output[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            output[i] = output[i-1] + nums[i];
        }
    return output;
    }
}
/*
class Solution {
    public int[] runningSum(int[] nums) {

        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}*/