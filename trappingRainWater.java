class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int water = 0;// Total water collected
        
        // First pass from left to right
        int j = 0;
        int sum = 0; // buildings in between

        for(int i=1; i<n; i++){
            
            if(i!=j)sum += arr[i];
            
            if(i!=j && arr[i] >= arr[j]){
                sum -= arr[i];
                water += (Math.min(arr[i], arr[j])*(i-j-1))-(sum);
                sum = 0;
                j = i;
            }
        }
        
        
        // Second pass from right to left
        sum = 0;
        j  = n-1;
        
        for(int i=n-2; i>=0; i--){
            
            if(i!=j)sum+=arr[i];
            
            if(i!=j && arr[i] > arr[j]){
                sum -= arr[i];
                water += (Math.min(arr[i], arr[j])*(j-i-1))-(sum);
                sum = 0;
                j = i;
            }
        }
        
        return water;
    }
}
