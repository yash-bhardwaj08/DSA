import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int curr = asteroids[i];

            while (!st.empty() && st.peek() > 0 && curr < 0) {

                if (st.peek() < -curr) {
                    // Stack asteroid is destroyed
                    st.pop();
                }

                else if (st.peek() == -curr) {
                    // Both are destroyed
                    st.pop();
                    curr = 0;
                    break;
                }

                else {
                    // Current asteroid is destroyed
                    curr = 0;
                    break;
                }
            }

            // Push only if current asteroid survived
            if (curr != 0) {
                st.push(curr);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}