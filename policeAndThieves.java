class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        int count = 0;
        int police = 0;
        int thieve = 0;
        
        while(police < n && thieve < n){
            while(police < n && arr[police] != 'P'){
                police++;
            }
            while(thieve < n && arr[thieve] != 'T'){
                thieve++;
            }
            
            if(police >= n || thieve >= n){
                break;
            }
            
            if(Math.abs(police - thieve) <= k){
                count++;
                arr[police] = 'C';
                arr[thieve] = 'C';
            }else if(police < thieve){
                police++;
            }else{
                thieve++;
            }
        }
        
        return count;
    }
}
