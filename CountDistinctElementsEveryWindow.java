class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        
        int left = 0;
        int right = 0;
        
        // Create the window first of k elements
        for(right=0; right<k; right++){
            int curr = arr[right];
            map.put(curr, map.getOrDefault(curr, 0)+1);
        }
        
        al.add(map.size());
        
        // Now move the window forward
        
        for(right=k; right<n; right++){
            int curr = arr[right];
            map.put(curr, map.getOrDefault(curr, 0)+1);
            
            int removed = arr[left];
            map.put(removed, map.get(removed)-1);
            if(map.get(removed) == 0){
                map.remove(removed);
            }
            left++;
            al.add(map.size());
        }
        
        return al;
    }
}
