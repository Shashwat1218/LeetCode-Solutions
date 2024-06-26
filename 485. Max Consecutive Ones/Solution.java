public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int flag=0;
        int occurance=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                occurance++;
                if(occurance>flag){
                    flag=occurance;
                }
            }else occurance=0;
        }
        return flag;
    }
    public static void main(String args[]){
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}