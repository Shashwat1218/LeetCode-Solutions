public class Solution {
    // Function to find the maximum number of consecutive 1's in the array `nums`
    public static int findMaxConsecutiveOnes(int[] nums) {
        int flag = 0;        // Initialize a variable to store the maximum consecutive 1's found
        int occurrence = 0;  // Initialize a variable to count current consecutive 1's
        
        // Iterate through the array `nums`
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {        // If the current element is 1
                occurrence++;          // Increment the count of consecutive 1's
                if (occurrence > flag) {
                    flag = occurrence; // Update `flag` if `occurrence` is greater
                }
            } else {
                occurrence = 0;         // Reset `occurrence` when encountering 0
            }
        }
        
        return flag;  // Return the maximum consecutive 1's found
    }
    
    // Main method where the program starts execution
    public static void main(String args[]) {
        int[] nums = {1, 1, 0, 1, 1, 1};  // Example array
        System.out.println(findMaxConsecutiveOnes(nums));  // Output the result
    }
}
