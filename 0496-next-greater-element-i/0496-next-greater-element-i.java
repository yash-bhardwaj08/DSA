class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];

        Stack <Integer> st = new Stack<>();
        HashMap <Integer, Integer> map  = new HashMap<>();
//WE GET THE NEXT GREATER ELEMENT HERE
        for(int i = n-1; i>= 0; i--){
            while(!st.empty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.empty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(nums2[i]);
        }
// PUT IN THE MAP TO REMEMBER FOR NUMS1 
        for(int i = 0; i<n; i++){
            map.put(nums2[i], nge[i]);
        }
// ASSINING TO NUMS1 THE CORRECT ORDER WITH NEXT GREATER
        int n2 = nums1.length;
        int[] ans = new int[n2];

        for(int i = 0; i<n2; i++){
           ans[i] =  map.get(nums1[i]);
        }


    return ans;
    }
}