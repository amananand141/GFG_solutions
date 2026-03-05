class Solution {
    public static String minWindow(String s, String p) {

        int[] freq = new int[128];

        // store frequency of characters of p
        for(char c : p.toCharArray()){
            freq[c]++;
        }

        int left = 0;
        int count = p.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++){

            char r = s.charAt(right);

            if(freq[r] > 0){
                count--;
            }

            freq[r]--;

            while(count == 0){

                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                freq[l]++;

                if(freq[l] > 0){
                    count++;
                }

                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start, start + minLen);
    }
}
