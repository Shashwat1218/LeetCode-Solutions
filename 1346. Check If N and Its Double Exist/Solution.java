
class Solution {
    public static int search(int[] arr, int element){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==element) return j;
        }
        return -1;
    }
    
    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int index = search(arr, 2 * arr[i]);
            if(index >= 0 && index != i) return true;
        }
        return false;
    }
}
