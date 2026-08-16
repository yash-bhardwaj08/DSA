class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int maxSum = 0;
        for(int i = 0; i<=k-1; i++){
            leftSum += cardPoints[i];
            
        }
        maxSum = leftSum;
        int rightSum = 0;
        for(int i = k-1; i>= 0; i--){
                leftSum = leftSum - cardPoints[i];
                rightSum = rightSum + cardPoints[n-1-(k-1-i )];
                
                maxSum = Math.max(maxSum, (leftSum+rightSum));
        }
        
        return maxSum;
    }
    
}