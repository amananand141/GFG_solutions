class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int five = 0; // we'll count the number of five's and ten's
        int ten = 0;
        
        for(int i=0; i<arr.length; i++){ //Iterate the array once
            
            // If the current passenger gives 5 increment five
            if(arr[i] == 5){
                five++;
            }else if(arr[i] == 10){ // If he/she gives 10 then increment ten
                ten++;
                if(five == 0){ // But we have to give give 5rs back so if we don't have it return false
                    return false;
                }
                five--;
            }else{ // If he/she gives 20rs
                if(five > 0 && ten > 0){ // we can pay by 5+10 rs 
                    five--;
                    ten--;
                }else if(five >= 3){ // we can pay by 5+5+5
                    five -= 3;
                }else{
                    return false; // In all other cases we'll return false
                }
            }
        }
        return true;
    }
}
