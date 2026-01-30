class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int first = 0;
        int n = q.size();
        int arr[] = new int[n];
        int second = n/2;
        
        for(int i=0; i<n; i++){
            arr[i] = q.poll();
        }
        
        while(second<n){
            q.add(arr[first++]);
            q.add(arr[second++]);
        }
        
    }
}
