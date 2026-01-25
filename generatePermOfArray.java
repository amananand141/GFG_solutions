class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], 1);
        }
        
        helper(ans, new ArrayList<>(), map, arr.length);
        
        return ans;
    }
    
    public static void helper(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, HashMap<Integer, Integer> map, int len){
        // Base case
        if(curr.size() == len){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        // Recursion and Backtracking
        for(int key : map.keySet()){
            if(map.get(key) > 0){
                curr.add(key);
                map.put(key, 0);
                
                helper(ans, curr, map, len);
                
                curr.remove(curr.size()-1);
                map.put(key, 1);
            }
        }
    }
};
