class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int n = arr.length;
        
        int left[] = new int[n];
        int right[] = new int[n];
        
        Stack<Integer> st = new Stack<>();

      // Left traversal
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        st.clear();

      // Right traversal
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        int ans = 0;
        
        for(int i=0; i<n; i++){
            ans = Math.max(ans, right[i]-left[i]-1);
        }
        
        return ans;
    }
}
