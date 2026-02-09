class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int startColor = image[sr][sc];
        helper(image, sr, sc, startColor, newColor);
        return image;
    }
    
    public void helper(int[][] image, int i, int j, int startColor, int newColor){
        // Base class
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j] == newColor || image[i][j] != startColor){
            return;
        }
        if(image[i][j] == startColor){
            image[i][j] = newColor;
        }
        
        helper(image, i-1, j, startColor, newColor);
        helper(image, i, j-1, startColor, newColor);
        helper(image, i+1, j, startColor, newColor);
        helper(image, i, j+1, startColor, newColor);
    }
}
