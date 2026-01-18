class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        
        // find the maximum value present in the given array
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        // Frequency array 
        int count[] = new int[max+1];
        
        for(int i=0; i<n; i++){
            count[arr[i]] += 1;
        }
        
        for(int i=0; i<n-1; i++){
            boolean flag = true;
            for(int j=i+1; j<n; j++){
                if(count[arr[j]] > count[arr[i]]){
                    al.add(arr[j]);
                    flag = false;
                    break;
                }
            }
            // if no such element is found that has greater frequency
            if(flag == true){
                al.add(-1);
            }
        }
        
        al.add(-1); // For the last element it will always be -1
        return al;
    }
}
