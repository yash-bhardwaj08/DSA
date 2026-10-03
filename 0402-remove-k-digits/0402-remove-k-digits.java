class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<num.length(); i++){
            char digit = num.charAt(i);

            while(!st.empty() && st.peek() > digit && k>0){
                st.pop();
                k--;
                
            }
            st.push(digit); 
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }
        // Remove leading zeros
        int i = 0;
        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }

        // If everything became zero
        if (i == result.length()) {
            return "0";
        }

        return result.substring(i);
    }
}