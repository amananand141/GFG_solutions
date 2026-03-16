/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int countAllPaths(Node root, int k) {
        // code here
        return dfs(root, k);
    }
    
    public int helper(Node root, int sum, int k){
        if(root == null){
            return 0;
        }
        int count = 0;
        sum += root.data;
        if(sum == k){
            count++;
        }
        
        count += helper(root.left, sum, k);
        count += helper(root.right, sum, k);
        
        return count;
    }
    
    public int dfs(Node node, int k){
        if(node == null){
            return 0;
        }
        
        int sum = helper(node, 0, k);
        
        sum += dfs(node.left, k);
        sum += dfs(node.right, k);
        
        return sum;
    }
}
