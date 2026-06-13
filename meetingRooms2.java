class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length; 
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0;
        int j = 0;
        
        int room = 0;
        int maxRoom = 0;
        
        while(i<n){
            if(start[i] < end[j]){
                room++;
                i++;
            }else{
                room--;
                j++;
            }
            
            maxRoom = Math.max(maxRoom, room);
        }
        
        return maxRoom;
    }
}
