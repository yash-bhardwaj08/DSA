/*class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;

        // Step 1: XOR of all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find the position of the rightmost set bit
        int exclusiveBit = 0;
        int temp = xor;

        while ((temp & 1) == 0) {
            temp >>= 1;
            exclusiveBit++;
        }

        // Step 3: Divide into two buckets
        int setBucket = 0;
        int unsetBucket = 0;

        for (int num : nums) {
            if (((num >> exclusiveBit) & 1) == 1) {
                setBucket ^= num;
            } else {
                unsetBucket ^= num;
            }
        }

        return new int[]{setBucket, unsetBucket};
    }
}*/
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor  = 0;
        for(int num : nums){
            xor = xor ^ num;
        }
        int mask = xor & (-xor);

        int setBucket = 0;
        int unSetBucket = 0;

        for(int num : nums){
            if((mask & num) !=0){
                setBucket = setBucket ^ num;
            }
            else{
                unSetBucket = unSetBucket ^ num;
            }
        }
    return new int[] {setBucket, unSetBucket};
    }
}