class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        return helper(arr, n, k)-helper(arr, n, k-1);
    }
    
    public int helper(int[] arr, int n, int k){
        int left = 0;
        int right = 0;
        int odd = 0;
        int ans = 0;
        
        while(right < n){
            if(arr[right]%2 == 1){
                odd++;
            }
            while(odd > k){
                if(arr[left]%2 == 1){
                    odd--;
                }
                left++;
            }
            ans += (right-left+1);
            right++;
        }
        
        return ans;
    }
}
