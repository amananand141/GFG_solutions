class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int count = 0;
        int n = arr.length;
        
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                count += n-i;
            }else{
                count += st.peek()-i;
            }
            
            st.push(i);
        }
        
        return count;
    }
}
