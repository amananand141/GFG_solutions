/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

// Create a new DS as Pair containing both node and its horizontal distance
class Pair{
    Node node;
    int hd; // distance from the root node
    Pair(Node n, int h){
        node = n;
        hd = h;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>(); 
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node node = p.node;
            int hd = p.hd;
            
            // Stores all the unique horizontal distances 
            if(!map.containsKey(hd)){
                map.put(hd, node.data);
            }
            
            if(node.left != null){
                q.add(new Pair(node.left, hd-1));
            }
            
            if(node.right != null){
                q.add(new Pair(node.right, hd+1));
            }
        }
        
        // retrive all the nodes with unique horizontal distance
        for(int val : map.values()){
            al.add(val);
        }
        
        return al;
    }
}
