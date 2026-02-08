class Solution {
    int maxProduct(int[] arr) {
        // code here
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=0; i<n; i++){
          // When there exists zero in the array
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }

          // Calculate prefix product and suffix product
            prefix *= arr[i];
            suffix *= arr[n-i-1];

          // Which of them is greater is alloted to the max value
            max = Math.max(max, Math.max(prefix, suffix));
        }
        
        return max;
    }
}
