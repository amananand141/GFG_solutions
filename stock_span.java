class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        
        Stack<Integer> st = new Stack<>();
        
        int i = 0;
        
        while(i<n){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                al.add(i+1);
            }else{
                al.add(i-st.peek());
            }
            st.push(i);
            i++;
        }
        return al;
    }
}
