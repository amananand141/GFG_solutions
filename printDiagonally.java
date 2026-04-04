class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();

        int n = mat.length;
        
        for(int i=0; i<n; i++){
           int row = 0;
           int col = i;
           
           while(col >=0){
               al.add(mat[row][col]);
               row++;
               col--;
           }
        }
        
        for(int j=1; j<n; j++){
            int row = j;
            int col = n-1;
            
            while(row < n){
                al.add(mat[row][col]);
                row++;
                col--;
            }
        }
        
        return al;
    }
}
