class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == word.charAt(0)){
                    boolean vis[][] = new boolean[n][m];
                    if(helper(mat, n, m, word, i, j, 0, vis)){
                       return true; 
                    }
                }
            }
        }
        
        return false;
    }
    
    
    public boolean helper(char[][]arr, int n, int m, String word, int i, int j, int len, boolean[][] vis){
        
        // Base Case
        if(len == word.length()){
            return true;
        }
        
        if(i<0 || j<0 || i>n-1 || j>m-1 || vis[i][j] == true){
            return false;
        }

        if(arr[i][j] != word.charAt(len)){
            return false;
        }
        
        vis[i][j] = true;
        
        boolean matched = helper(arr, n, m, word, i-1, j, len+1, vis) ||
        helper(arr, n, m, word, i, j-1, len+1, vis) ||
        helper(arr, n, m, word, i+1, j, len+1, vis) ||
        helper(arr, n, m, word, i, j+1, len+1, vis);
    
        vis[i][j] = false;
        
        return matched;
    }
}
