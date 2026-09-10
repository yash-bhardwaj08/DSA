class Solution {
    public int totalFruit(int[] nums) {
        int fruit1 = nums[0]; // what type
        int fruit2 = -1;
        
        int count1 = 0; // how many
        int count2 = 0; 

        int maxLen = 0;

        int left = 0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right] == fruit1){
                count1++;
            }
            else if(fruit2 == -1){
                fruit2 = nums[right];
                count2++;
            }
            else if(nums[right] == fruit2){
                count2++;
            }
            else{
                while(count1 > 0 && count2 > 0){
                    if(nums[left] == fruit1){
                        count1--;
                    }
                    else{
                        count2--;
                    }
                    left++;
                }
                if(count1 == 0){
                    fruit1= nums[right];
                    count1++;
                }
                else{
                    fruit2 = nums[right];
                    count2++;
                }

            }
            
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }
    return maxLen;
    }
}