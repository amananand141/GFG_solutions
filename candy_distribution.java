class Solution {
    public int minCandy(int arr[]) {
        // code here
        int n = arr.length;
        int candy = 0;
        int ca[] = new int[n]; // Arrays to keep the record of the distributed candies
        Arrays.fill(ca, 1);
        
        //left to right traversal
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                ca[i] = ca[i-1] + 1;
            }
        }
        
        //right to left traversal
        for(int i=n-2; i>=0; i--){
            if(arr[i] > arr[i+1]){
                ca[i] = Math.max(ca[i], ca[i+1] + 1);
            }
        }
        
        //Use all the elements of the 'ca' array to count the distributed candies
        for(int ele : ca){
            candy += ele;
        }
        
        return candy;
    }
}
