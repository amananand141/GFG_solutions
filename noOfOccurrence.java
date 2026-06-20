class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        return helper(arr, target, 0, arr.length-1);
    }
    
    int helper(int[] arr, int target, int low, int high){
        if(low > high){
            return 0;
        }
        
        int mid = low + (high-low)/2;
        
        if(arr[mid] == target){
            return helper(arr, target, low, mid-1) + helper(arr, target, mid+1, high) + 1;
        }else if(arr[mid] > target){
            return helper(arr, target, low, mid-1);
        }else{
            return helper(arr, target, mid+1, high);
        }
    }
}
