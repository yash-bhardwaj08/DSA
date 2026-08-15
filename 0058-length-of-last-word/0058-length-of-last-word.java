class Solution {
    public int lengthOfLastWord(String s) {
        /*
        int count = 0;
        for(int i = s.length()-1; i>= 0; i--){
            if(s.charAt(i) == ' ' && count == 0){
                continue;
            }
            
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
    return count;
    }
}
*/
        int count = 0;
        int right = s.length()-1;
        while(right>= 0 && s.charAt(right) == ' '){
            right--;
        }
        while(right>= 0 && s.charAt(right) != ' '){
            count++;
            right--;
        }
        return count++;
    }
}