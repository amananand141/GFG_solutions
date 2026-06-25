class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1];
        int ans = Integer.MIN_VALUE;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isPossible(stalls, k, mid)){
                low = mid+1;
                ans = mid;
            }else{
                high = mid-1;
            }
        }
        
        return ans;
    }
    
    public boolean isPossible(int[] stalls, int cows, int dist){
        int prev = stalls[0];
        cows--;
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - prev >= dist){
                cows--;
                prev = stalls[i];
            }
        }
        return cows<=0;
    }
}
