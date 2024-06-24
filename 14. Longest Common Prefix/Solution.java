public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        // Check if the input array is null or empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Initialize the prefix with the first string in the array
        String prefix = strs[0];
        
        // Iterate through the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the current prefix, shorten the prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Remove the last character from prefix
                // If prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix; // Return the longest common prefix found
    }

    public static void main(String args[]) {
        // Example usage and testing
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs)); // Output: "fl"
    }
}
