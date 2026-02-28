class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int n = arr1.length; 
        int m = arr2.length; 
        
        int i = n-1; // start one pointer from the last index of an array
        int j = 0; // and one pointer from the start of another array
        
        int prevDiff = Integer.MAX_VALUE;
        
        int a = -1; // stores the minimum values to be added in the al
        int b = -1;
        
        while(i>=0 && j<m){
            int sum = arr1[i] + arr2[j];
            if(Math.abs(sum-x) <= prevDiff){
                a = arr1[i];
                b = arr2[j];
                prevDiff = Math.abs(sum-x);
            }
            
            if(sum <= x){// Smaller sum
                j++;
            }else{// larger sum
                i--;
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a);
        al.add(b);
        return al;
    }
}
