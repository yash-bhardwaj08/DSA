class Solution {
    public int trap(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int total = 0;

        while(left < right){
            if(nums[left] <= nums[right]){
                if(leftmax > nums[left]){
                    total += leftmax - nums[left];
                }
                else{
                    leftmax = nums[left];
                }
                left++;
            }
            else{
                if(rightmax > nums[right] ){
                    total += rightmax - nums[right];
                }
                else{
                    rightmax = nums[right];
                }
                right--;
            }
            
        }
    return total;
    }
}