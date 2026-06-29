class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length; 
        if(k > n){
            return -1;
        }
        
        int high = 0;
        int low = 0;
        for(int page : arr){
            high += page;
            low = Math.max(low, page);
        }
        
        if(k == 1)return high;
        
        int ans = high;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canAllocate(arr, k, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    boolean canAllocate(int[] arr, int k, int limit) {
        int students = 1;
        int pages = 0;

        for (int book : arr) {
            if (pages + book > limit) {
                students++;
                pages = book;
            } else {
                pages += book;
            }
        }

        return students <= k;
    }
}
