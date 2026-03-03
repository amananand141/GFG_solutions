class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int xor = 0;
        int i=0;
        int j;

        // Create a window of size k
        for(j=0; j<k; j++){
            xor = xor^arr[j];
        }
        int max = xor; // Store it in max         
        
        for(j=k; j<arr.length; j++){
            xor = xor^arr[i]; // remove the element at i as it is going to be removed from the window
            xor = xor^arr[j]; // Add the upcoming element in the window
            i++;
            max = Math.max(max, xor); // store the maximum xor value
        }
        
        return max;
    }
}
