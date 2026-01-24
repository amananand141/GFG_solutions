class Solution {
    
    // Linked List based approach
    
    class Node{
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
        }
    }
    
    Node head;
    Node root;
    
    public void insert(int val){
        
        for(int i=1; i<=val; i++){
            Node newNode = new Node(i);
            
            if(root == null){
                root = newNode;
                head = newNode;
            }else{
                head.next = newNode;
                head = newNode;
            }
        }
    }
    
    public int helper(Node root, int n, int k){
        int count = 0;
        int deleted = 0;
        Node temp = head;
        
        while(deleted != n-1){
            if(count == k-1){
                temp.next = temp.next.next;
                deleted++;
                count = 0;
            }else{
                count++;
                temp = temp.next;
            }
        }
        return temp.val;
    }
    
    public int josephus(int n, int k) {
        // code here
        insert(n);
        head.next = root;
        
        int ans = helper(root, n, k);
        return ans;
    }
}
