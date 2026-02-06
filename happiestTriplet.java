class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int ans[] = new int[3];
        
        int i=0, j=0, k=0;
        int n = a.length;
        int happy = Integer.MAX_VALUE;
        
        while(i<n && j<n && k<n){
            int x = a[i];
            int y = b[j];
            int z = c[k];
            
            int currMin = Math.min(x, Math.min(y,z));
            int currMax = Math.max(x, Math.max(y,z));
            
            if(currMax-currMin < happy){
                ans[0] = currMax;
                ans[1] = x+y+z-currMax-currMin;
                ans[2] = currMin;
                happy = currMax-currMin;
            }
            
            if(x == currMin){
                i++;
            }else if(y == currMin){
                j++;
            }else{
                k++;
            }
        }
        return ans;
    }
}
