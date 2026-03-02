class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n = arr.length;
        if(n <= 2)return n;
        
        int l = 0;
        int r = 0;
        int maxi = Integer.MIN_VALUE;
        
        while(r < n){
            map.put(arr[r], map.getOrDefault(arr[r], 0)+1);

            if(map.size()>2){
                map.put(arr[l], map.get(arr[l])-1);
                
                if(map.get(arr[l]) == 0){
                    map.remove(arr[l]);
                }
                l++;
            }
            maxi = Math.max(maxi, r-l+1);
            r++;
        }
        
        return maxi;
    }
}
