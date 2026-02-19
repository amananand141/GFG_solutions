class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int x : arr){
            set.add(x);
        }
        
        for(int i=low; i<=high; i++){
            if(!set.contains(i)){
                al.add(i);
            }
        }
        
        return al;
    }
}
