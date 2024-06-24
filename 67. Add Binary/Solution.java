public class Solution {

    /**
     * Adds two binary strings and returns their sum as a binary string.
     * 
     * @param a The first binary string.
     * @param b The second binary string.
     * @return The sum of the binary strings as a binary string.
     */
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // To store the resultant binary string
        
        int i = a.length() - 1; // Pointer for string a, starting from the end
        int j = b.length() - 1; // Pointer for string b, starting from the end
        int carry = 0; // Initialize carry to 0
        
        // Loop through both strings from end to start
        while (i >= 0 || j >= 0) {
            int sum = carry; // Initialize sum with the carry value
            
            // Add the value of the current digit of a to sum if it exists
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert character to integer
                i--; // Move to the next digit
            }
            
            // Add the value of the current digit of b to sum if it exists
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert character to integer
                j--; // Move to the next digit
            }
            
            result.append(sum % 2); // Append the binary digit (0 or 1) to the result
            carry = sum / 2; // Update carry for the next iteration
        }
        
        // If there is a carry left, append it to the result
        if (carry != 0) {
            result.append(carry);
        }
        
        // Reverse the result since we added digits from least significant to most significant
        return result.reverse().toString();
    }

    public static void main(String args[]) {
        // Example usage and testing
        System.out.println(addBinary("11", "1")); // Output: 100
    }
}
