
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        List<int[]> al = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            // +1 indicates the starting of that particular interval
            al.add(new int[]{arr[i][0], 1});
            // -1 indicates the ending of that particular interval
            al.add(new int[]{arr[i][1]+1, -1}); // +1 is done here because the interval is inclusive
        }
        
        Collections.sort(al, (a,b)->{
            if(a[0] == b[0]){
                return a[1] - b[1]; // -1 pehle aayega
            }
            return a[0] - b[0];
        });
        
        int curr = 0;
        int max = 0;
        
        for(int[] x : al){
            // if +1 comes i.e. we got the start of the interval
            // if -1 comes i.e. we got the end of the interval
            curr += x[1];
            max = Math.max(max, curr);
        }
        
        return max;
    }
}
