class Solution {
    public int countSubstrings(String s) {
        int count  = 0;
        for(int i = 0; i<s.length(); i++){

            // for odd mid
            int left = i;
            int right = i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
                
            }
            //for even mid 
            left = i;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
                
            }
        }
        return count;
    }
}