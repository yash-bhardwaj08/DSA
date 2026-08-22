class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int start = 0;

        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){

                int left = i;
                int right = j;
                boolean isPalindrome = true;

                while(left<right){
                    if(s.charAt(left) != s.charAt(right)){
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                    if(isPalindrome){
                        int length = j-i+1;
                        if(length>maxLen){
                            maxLen = length;
                            start = i;
                        }
                    }
                
            }

        }
    return s.substring(start, start +maxLen);
    }
}