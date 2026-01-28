class Solution {
    
    public HashMap<String, Integer> map;
    
    public int countSubset(int[] arr, int k) {
        int positiveSum = 0;
        int negativeSum = 0;
        
        for(int num : arr){
            if(num > 0){
                positiveSum += num;
            }else{
                negativeSum += num;
            }
        }
        
        if(k>positiveSum || k<negativeSum){
            return 0;
        }
        
        map = new HashMap<>();
        return helper(arr, 0, k);
    }
    
    public int helper(int[] arr, int i, int target) {
        // Only decide at the end
        if (i == arr.length) {
            return target == 0 ? 1 : 0;
        }
        
        String key = i+"_"+target;
        if(map.containsKey(key)){
            return map.get(key);
        }
        
        // Include current element
        int take = helper(arr, i+1, target-arr[i]);
        // Exclude current element
        int notTake = helper(arr, i+1, target);
        
        map.put(key, take+notTake);
        
        return take+notTake;
    }
}
