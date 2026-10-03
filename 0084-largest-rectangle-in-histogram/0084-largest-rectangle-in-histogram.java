import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            // Current height is smaller than stack top
            while (!st.empty() && heights[st.peek()] > heights[i]) {

                int element = st.peek();
                st.pop();

                int nse = i;

                int pse;
                if (st.empty()) {
                    pse = -1;
                } else {
                    pse = st.peek();
                }

                int area = heights[element] * (nse - pse - 1);

                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }

        // Elements remaining in stack have NSE = n
        while (!st.empty()) {

            int element = st.peek();
            st.pop();

            int nse = n;

            int pse;
            if (st.empty()) {
                pse = -1;
            } else {
                pse = st.peek();
            }

            int area = heights[element] * (nse - pse - 1);

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}