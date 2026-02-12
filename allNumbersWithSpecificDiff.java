class Solution {
    public int getCount(int n, int d) {
        // code here
        int low = 0;
        int high = n;
        int firstValid = n+1;
        
        // Main idea here is if we can find the first value where it becomes >= d
        // Then all the values after that till n has diff greater than d
        
        while(low <= high){
            int mid = (high+low)/2;
            if(mid - sumOfDigits(mid) >= d){
               firstValid = mid;
               high = mid-1;;
            }else{
                low = mid+1;
            }
        }
        
        if(firstValid == n+1){
            return 0;
        }
        
        return n-firstValid+1;
    }
    
    public int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
};
