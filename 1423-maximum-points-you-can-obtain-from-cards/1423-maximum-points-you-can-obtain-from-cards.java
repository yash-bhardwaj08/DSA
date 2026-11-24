class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int mmax = 0;
        int sum = 0;
        int n = cardPoints.length;
        for(int i = 0; i<k; i++){
            sum += cardPoints[i];
        }
        mmax = sum;
        int left = k-1;
        int right = n-1;
        while(left>= 0){
            sum = sum + cardPoints[right] - cardPoints[left];
            mmax = Math.max(mmax,sum);
            left--;
            right--;
        }
    return mmax;
        
    }
    
}