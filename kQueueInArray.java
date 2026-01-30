class kQueues {
    
    ArrayList<Queue<Integer>> ans = new ArrayList<>();
    int n;
    int k;
    int size;
    
    kQueues(int n, int k) {
        // Initialize your data members
        for(int i=0; i<n; i++){
            ans.add(new LinkedList<>());
        }
        this.k = k;
        this.n = n;
    }

    void enqueue(int x, int i) {
        // enqueue element x into queue number i
        if(i >= ans.size()){
            return;
        }
        size++;
        ans.get(i).add(x);
    }

    int dequeue(int i) {
        // dequeue element from queue number i
        if(i >= ans.size() || ans.get(i).isEmpty()){
            return -1;
        }
        size--;
        return ans.get(i).poll();
    }

    boolean isEmpty(int i) {
        // check if queue i is empty
        if(i >= ans.size()){
            return false;
        }
        return ans.get(i).isEmpty();
    }

    boolean isFull() {
        // check if array is full
        if(size == n){
            return true;
        }
        return false;
    }
}
