
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate left products
        int[] leftProducts = new int[n];
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Calculate right products and construct result
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = leftProducts[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}
