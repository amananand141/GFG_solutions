class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length; 
        
        int start = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                swap(arr, i, start);
                start++;
            }
        }
    }
    
    void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
