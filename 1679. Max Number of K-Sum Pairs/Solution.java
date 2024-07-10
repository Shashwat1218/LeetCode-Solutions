
class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0, l = 0, r = nums.length - 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                nums[i] = 0;
                l++;
            }
        }
        Arrays.sort(nums);
        while (l < r){
            int sum = nums[l] + nums[r];
            if (sum == k){
                count++;
                l++;
                r--;
            }else if (sum > k)
                r--;
            else 
                l++;
        }
        return count;
    }
}
