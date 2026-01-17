class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '+' || curr == '-' || curr == '*' || curr == '/'){
                st.push(curr);
            }else if (curr == ')'){
                boolean operator = false;
                while(!st.isEmpty() && st.peek() != '('){
                    char popped = st.pop();
                    if(popped == '+' || popped == '-' || popped == '*' || popped == '/'){
                        operator = true;
                    }
                }
                if(operator == false){
                    return true;
                }
                st.pop();
            }
        }
        return false;
    }
}
