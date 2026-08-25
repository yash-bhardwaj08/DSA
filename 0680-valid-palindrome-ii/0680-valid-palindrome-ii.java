class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                int l1 = left;
                int r1 = right-1;

                while(l1<r1 && s.charAt(l1) == s.charAt(r1)){
                    l1++;
                    r1--;
                }
                if(l1>=r1){
                        return true;
                }
                int l2 = left+1;
                int r2 = right;
                while(l2<r2 && s.charAt(l2) == s.charAt(r2)){
                    l2++;
                    r2--;
                }
                if(l2>=r2){
                        return true;
                }
                return false;

            }
            
        }
        return true;
    }
}