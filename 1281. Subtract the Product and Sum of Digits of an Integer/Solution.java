public class Solution {
    public static int subtractProductAndSum(int n) {
        int sum = 0; // Initialize sum of digits to 0
        int prod = 1; // Initialize product of digits to 1
        int temp1 = 0; // Temporary variable to store the quotient
        int temp2 = 0; // Temporary variable to store the remainder

        // Loop through each digit of the number
        while (n != 0) {
            temp1 = n / 10; // Get the quotient by dividing n by 10
            temp2 = n % 10; // Get the remainder (last digit) by modulo 10
            sum += temp2;   // Add the digit to the sum
            prod *= temp2;  // Multiply the digit to the product
            n = temp1;      // Update n to the quotient for the next iteration
        }
        
        // Return the difference between product and sum of the digits
        return prod - sum;
    }

    public static void main(String args[]) {
        // Example usage and testing
        System.out.println(subtractProductAndSum(234)); // Output: 15
    }
}
