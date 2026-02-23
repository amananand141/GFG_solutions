class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int ele : a){
            if(!set.contains(ele)){
                al.add(ele);
                set.add(ele);
            }
        }
        
        for(int ele : b){
            if(!set.contains(ele)){
                al.add(ele);
                set.add(ele);
            }
        }
        
        return al;
    }
}
