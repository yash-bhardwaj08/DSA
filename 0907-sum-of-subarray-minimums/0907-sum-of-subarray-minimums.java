class Solution {
    public int[] getNSL(int[] arr, int n) {
        int[] nsl = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }

            st.push(i);
        }

        return nsl;
    }
    public int[] getNSR(int[] arr, int n) {
        int[] nsr = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nsr[i] = n;
            } else {
                nsr[i] = st.peek();
            }

            st.push(i);
        }

        return nsr;
    }
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] NSL = getNSL(arr, n);
        int[] NSR = getNSR(arr, n);

        long sum = 0;
        long M = 1000000007;

        for (int i = 0; i < n; i++) {

            long left = i - NSL[i];
            long right = NSR[i] - i;

            long totalWays = left * right;

            long totalSum = (long) arr[i] * totalWays;

            sum = (sum + totalSum) % M;
        }

        return (int) sum;
    }
}