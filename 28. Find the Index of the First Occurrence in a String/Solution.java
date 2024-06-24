public class Solution {
    public static int strStr(String haystack, String needle) {
        // Check if haystack contains needle
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle); // Return the index of the first occurrence of needle in haystack
        }
        return -1; // Return -1 if needle is not found in haystack
    }

    public static void main(String args[]) {
        // Example usage and testing
        System.out.println(strStr("sadbutsad", "sad")); // Output: 0
    }
}
