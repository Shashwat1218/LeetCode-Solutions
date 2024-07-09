
class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0, secondLargest = 0, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        if (2 * secondLargest <= largest) {
            return index;
        }
        return -1;
    }
}
