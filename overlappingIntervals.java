class Solution {
    static boolean isIntersect(int[][] intervals) {
        // Code Here
        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        
        int[] curr = new int[2];
        curr = intervals[0];
        
        for(int i=1; i<intervals.length; i++){
            if(curr[1] >= intervals[i][0]){
                return true;
            }
            curr = intervals[i];
        }
        
        return false;
    }
}
