class Solution {
    public int minCost(int[] heights, int[] cost) {
        // BRUTE FORCE
        // int c = Integer.MAX_VALUE;
        
        // for(int i=0; i<heights.length; i++){
        //     int curr = heights[i];
        //     int currcost = 0;
        //     for(int j=0; j<heights.length; j++){
        //         currcost += (Math.abs(heights[i]-heights[j])*cost[j]);
        //     }
        //     c = Math.min(c, currcost);
        // }
        
        // return c;
        
        
        // OPTIMIZED APPROACH
        
        int low=Arrays.stream(heights).min().getAsInt();

        int high=Arrays.stream(heights).max().getAsInt();

        long ans=Long.MAX_VALUE;

        while(low<=high){

            int mid=(low+high)/2;

            long cost1=getCost(heights,cost,mid);

            long cost2=getCost(heights,cost,mid+1);

            ans=Math.min(cost1,cost2);

            if(cost1<cost2){

                high=mid-1;

            }else{

                low=mid+1;

            }

        }

        return (int)ans;
    }
    
    private long getCost(int[]heights,int[]cost,int mid){

        long total=0;

        for(int i=0;i<heights.length;i++){

            total+=(long)Math.abs(heights[i]-mid)*cost[i];

        } 

        return total;

      }
}
