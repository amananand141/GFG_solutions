class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        int max = -1;
        int low = 0;
        int high;
        
        for(high=0; high<n; high++){
            char curr = s.charAt(high);
            map.put(curr, map.getOrDefault(curr, 0)+1);
            
            if(map.size() == k){
                max = Math.max(max, high-low+1);
            }
            
            while(map.size() > k){
                char prev = s.charAt(low);
                map.put(prev, map.get(prev)-1);
                low++;
                
                if(map.get(prev) == 0){
                    map.remove(prev);
                }
            }
        }
        
        return max;
    }
}
