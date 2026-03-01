class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        
        int n = maze.length;
        helper(maze, ans, curr, 0, 0, n);
        
        return ans;
    }
    
    public void helper(int[][] maze, ArrayList<String> ans, StringBuilder curr, int i, int j, int n){
        String dir = "DLRU";
        int[] ver = {1, 0, 0, -1};
        int[] hor = {0, -1, 1, 0};
        
        if(i == n-1 && j == n-1){
            ans.add(curr.toString());
            return;
        }
        
        maze[i][j] = 0;
        
        for(int x=0; x<4; x++){
            int nrow = i+ver[x];
            int ncol = j+hor[x];
            
            if(isSafe(maze, nrow, ncol)){
                curr.append(dir.charAt(x));
                helper(maze, ans, curr, nrow, ncol, n);
                curr.deleteCharAt(curr.length()-1);
            }
        }
        
        maze[i][j] = 1;
    }
    
    public boolean isSafe(int[][] maze, int i, int j){
        if(i<0 || i>=maze.length || j<0 || j>=maze.length || maze[i][j] == 0){
            return false;
        }else{
            return true;
        }
    }
}
