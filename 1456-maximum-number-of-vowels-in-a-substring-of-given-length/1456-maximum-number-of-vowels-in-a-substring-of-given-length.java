class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int maxVow = 0;
        int count  = 0;
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        maxVow = count;
        for(int right = k; right<s.length(); right++){
            
            if(s.charAt(left) == 'a' || s.charAt(left)== 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u'){
                count--;
            }
            left++;
            if(s.charAt(right) == 'a' || s.charAt(right)== 'e' ||s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u' ){
                count++;
            }
            maxVow = Math.max(maxVow,count);
        }
        return maxVow;
    }
}