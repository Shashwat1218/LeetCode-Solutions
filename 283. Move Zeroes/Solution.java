
class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length-1; 
        int non_zero=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[non_zero]=nums[i];
                non_zero++;
            }else{
                zero++;
            }
        }
        for(int j=0;j<zero;j++){
            nums[l]=0;
            l--;
        }
    }
}
