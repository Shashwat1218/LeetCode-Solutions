class Solution {
    public static void duplicateZeros(int[] arr) {
        // Create a copy of the original array
        int arr1[] = arr.clone();
        
        // Initialize a pointer for the original array
        int s = 0;
        
        // Iterate through the copied array
        for (int i = 0; s < arr.length; i++) {
            // Assign the current element of the copied array to the original array
            arr[s++] = arr1[i];
            
            // If the current element is zero and there's still space in the original array
            if (arr1[i] == 0 && s != arr.length) {
                // Insert an additional zero
                arr[s++] = 0;
            }
        }
    }
}
