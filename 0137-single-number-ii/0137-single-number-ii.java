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
}