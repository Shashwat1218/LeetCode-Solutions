public class Solution {
    // Function to count numbers with an even number of digits in the array `nums`
    public static int findNumbers(int[] nums) {
        int finalCount = 0;  // Initialize variable to count numbers with even number of digits
        
        // Iterate through each number in `nums`
        for (int num : nums) {
            int count = 0;  // Initialize variable to count digits in current number `num`
            
            // Count digits in `num` using a while loop
            while (num > 0) {
                count++;    // Increment count for each digit
                num /= 10;  // Remove the last digit from `num`
            }
            
            // Check if the count of digits in `num` is even
            if (count % 2 == 0) {
                finalCount++;  // Increment final count if number has even number of digits
            }
        }
        
        return finalCount;  // Return the total count of numbers with even number of digits
    }
}
