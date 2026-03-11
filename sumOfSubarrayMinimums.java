class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        // no. of elements smaller than the current from the left side
        
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            left[i] = st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        
        st.clear();
        
        // no. of elements smaller than the current from the right
        
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            right[i] = st.isEmpty() ? n-i : st.peek()-i;
            st.push(i);
        }
        
        // calculate the final answer
        
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i]*left[i]*right[i];
        }
        
        return sum;
    }
}
