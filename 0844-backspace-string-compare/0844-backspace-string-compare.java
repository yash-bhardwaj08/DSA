class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        int skip = 0;
        int skipt = 0;

        while (i >= 0 || j >= 0) {

            // Find next valid character in s
            while (i >= 0) {

                if (s.charAt(i) == '#') {
                    skip++;
                    i--;
                }
                else if (skip > 0) {
                    skip--;
                    i--;
                }
                else {
                    break;
                }
            }

            // Find next valid character in t
            while (j >= 0) {

                if (t.charAt(j) == '#') {
                    skipt++;
                    j--;
                }
                else if (skipt > 0) {
                    skipt--;
                    j--;
                }
                else {
                    break;
                }
            }

            // Compare the actual characters
            if (i >= 0 && j >= 0) {

                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }

            }
            // One string has a character while other doesn't
            else if (i >= 0 || j >= 0) {
                return false;
            }

            // Move to previous characters
            i--;
            j--;
        }

        return true;
    }
}