
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int third_max = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                third_max = nums[i - 1];
                count++;
            }
            if (count == 3) return third_max;        
        }
        return nums[nums.length - 1];
    }
}
