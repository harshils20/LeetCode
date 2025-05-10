class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Compute the initial window sum (first k elements)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window over the array
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return the maximum average
        return (double) maxSum / k;
    }
}
