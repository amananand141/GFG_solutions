class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum = 0;
        int currMax = 0;
        int currMin = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        
        for(int i=0; i<arr.length; i++){
            // To find maximum sum subarray
            currMax = Math.max(currMax + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMax);
            
            // To find minimum sum subarray
            currMin = Math.min(currMin + arr[i], arr[i]);
            minSum = Math.min(minSum, currMin);
            
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        if(minSum == totalSum){
            return normalSum;
        }
        
        return Math.max(normalSum, circularSum);
    }
}
