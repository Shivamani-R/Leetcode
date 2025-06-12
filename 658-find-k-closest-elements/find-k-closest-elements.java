class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (k > 0) {
                pq.offer(arr[i]);
                k--;
            } else if (Math.abs(pq.peek() - x) > Math.abs(arr[i] - x)) {
                pq.poll();
                pq.offer(arr[i]);
            }
        }

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        return ans;
    }
}