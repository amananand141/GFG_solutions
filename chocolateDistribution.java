
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int low = 0;
        int high = m-1;
        int ans = Integer.MAX_VALUE;
        
        while(high < arr.size()){
            int diff = arr.get(high)-arr.get(low);
            ans = Math.min(ans, diff);
            low++;
            high++;
        }
        
        return ans;
    }
}
