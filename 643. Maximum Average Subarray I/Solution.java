
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, curr_avg = 0, max_avg = Integer.MIN_VALUE;
        if (nums.length < k) {
            return 0;
        }
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        curr_avg = sum / k;
        max_avg = Math.max(max_avg, curr_avg);
        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k];
            curr_avg = (sum / k);
            max_avg = Math.max(max_avg, curr_avg);
        }
        return max_avg;
    }
}
