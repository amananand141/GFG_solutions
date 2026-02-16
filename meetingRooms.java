class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        int start = 0;
        int end = 0;
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        
        for(int i=1; i<arr.length; i++){
            start = arr[i][0];
            end = arr[i-1][1];
            if(start < end){
                return false;
            }
        }
        return true;
    }
}
