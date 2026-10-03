class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {

        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        // k == 1
        if (k == 1) {
            return (int) kadane(arr);
        }

        // Kadane on 2 copies
        long maxSum = kadaneTwoCopies(arr);

        // If total sum is positive, remaining copies
        // can increase the answer
        if (totalSum > 0) {
            maxSum += (long) (k - 2) * totalSum;
        }

        return (int) (maxSum % 1_000_000_007);
    }

    private long kadane(int[] arr) {

        long current = 0;
        long max = 0;

        for (int num : arr) {
            current = Math.max(0, current + num);
            max = Math.max(max, current);
        }

        return max;
    }

    private long kadaneTwoCopies(int[] arr) {

        long current = 0;
        long max = 0;

        int n = arr.length;

        for (int i = 0; i < 2 * n; i++) {

            int num = arr[i % n];

            current = Math.max(0, current + num);
            max = Math.max(max, current);
        }

        return max;
    }
}