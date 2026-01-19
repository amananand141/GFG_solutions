class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        if(k == n){
            return "0";
        }
        
        for(int i=0; i<n; i++){
            char curr = s.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek() > curr){
                st.pop();
                k--;
            }
            st.push(curr);
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        StringBuilder ans = new StringBuilder();
        Collections.reverse(st);
        
        while(!st.isEmpty() && st.peek() == '0'){
            st.pop();
        }
        
        if(!st.isEmpty()){
            while(!st.isEmpty()){
                ans = ans.append(st.pop());
            }
            return ans.toString();
        }
        return "0";
    }
}
