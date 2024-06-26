class Solution {
    // Function to return an array of squares of each number sorted in non-decreasing order
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];   // Initialize result array to store squared values
        int left = 0, right = n - 1; // Initialize pointers for the start and end of `nums`
        int index = n - 1;           // Initialize index to insert squared values into `result`
        
        // Loop until pointers meet
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];     // Square of number at left pointer
            int rightSquare = nums[right] * nums[right];  // Square of number at right pointer
            
            // Compare squares and insert larger square into `result` from the end
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;   // Insert leftSquare into `result`
                left++;                        // Move left pointer rightward
            } else {
                result[index--] = rightSquare;  // Insert rightSquare into `result`
                right--;                       // Move right pointer leftward
            }
        }
        
        return result;  // Return sorted array of squared numbers
    }
    
    // Main method to demonstrate the usage of `sortedSquares` function
    public static void main(String args[]){
        int[] nums = {-4,-1,0,3,10};       // Example input array
        int[] result = sortedSquares(nums); // Get sorted squares of `nums`
        
        // Print each element of `result` separated by a space
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
