class Solution {
    StringBuilder sb = new StringBuilder();
    Stack<Character> st = new Stack<>(); // For storing the recently removed element from the string builder by the UNDO operation
    
    public void append(char x) {
        // append x into document
        sb = sb.append(x);
    }
    public void undo() {
        // undo last change
        st.push(sb.charAt(sb.length()-1));
        sb.deleteCharAt(sb.length()-1);
    }

    public void redo() {
        // redo changes
        sb.append(st.pop());
    }

    public String read() {
        // read the document
        return sb.toString();
    }
}
