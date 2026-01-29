class Solution {
    public String firstNonRepeating(String s) {
        // code here
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int []arr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            int val = curr - 'a';
            arr[val]++;
            
            if(arr[val] <= 1){
                q.add(curr);
            }else{
                q.remove(curr);
            }
            
            if(q.isEmpty()){
                sb.append('#');
            }else{
                sb.append(q.peek());
            }
        }
        
        return sb.toString();
    }
}
