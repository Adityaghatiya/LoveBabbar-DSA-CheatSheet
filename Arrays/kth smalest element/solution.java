class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Get the kth smallest element
        PriorityQueue<Integer> l1 = new PriorityQueue<>();

        for (int i = l; i <= r; i++) {
            l1.add(arr[i]);
        }

        while (k > 1) {
            l1.poll();
            k--;
        }

        return l1.peek();
    }
