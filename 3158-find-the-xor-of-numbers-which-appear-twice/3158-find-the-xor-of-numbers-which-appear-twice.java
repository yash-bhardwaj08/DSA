class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            if(set.contains(num)){
                ans = ans ^ num;
            }
            else{
                set.add(num);
            }
        }
    return ans;
    }
}