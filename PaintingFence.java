class Solution {
    int countWays(int n, int k) {
        // code here.
        if(n == 1){
            return k;
        }
        
        /// for n=2
        int same = k;
        int diff = k*(k-1);
        
        for(int i=3; i<=n; i++){
            int newDiff = (same+diff)*(k-1);
            int newSame = diff;
            
            same = newSame;
            diff = newDiff;
        }
        
        return same+diff;
    }
}
