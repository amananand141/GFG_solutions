class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // 1. Remove elements out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements (they can't be max)
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Window formed → add max
            if (i >= k - 1) {
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }
}
