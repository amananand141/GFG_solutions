class Solution {
    int maxSum(int[] arr) {
        // code here
        int sum = 0;
        int window = 0;
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            window += i*arr[i];
        }
        
        int ans = window;
        
        for(int i=0; i<n; i++){
            int diff = sum-arr[i];
            int add = arr[i]*(n-1);
            
            window = window-diff+add;
            
            ans = Math.max(ans, window);
        }
        
        return ans;
    }
}
