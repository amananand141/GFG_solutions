class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int n = arr.length;
        int flips = 0;
        int flipParity = 0;

        int[] isFlipped = new int[n];

        for(int i = 0; i < n; i++) {

            if(i >= k) {
                flipParity ^= isFlipped[i-k];
            }

            int current = arr[i] ^ flipParity;

            if(current == 0) {

                if(i + k > n) return -1;

                flips++;
                flipParity ^= 1;
                isFlipped[i] = 1;
            }
        }

        return flips;
    }
}
