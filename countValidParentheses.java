// Recursive approach here

class Solution {
    int findWays(int n) {
        // code here
        return helper(n, 1, 1, 0);
    }
    
    int helper(int n, int count, int open, int close){
        
        if(open > n/2 || close > open){
            return 0;
        }
        
        if(n == count){
            return 1;
        }
        
        return helper(n, count+1, open+1, close) + helper(n, count+1, open, close+1);
    }
}
