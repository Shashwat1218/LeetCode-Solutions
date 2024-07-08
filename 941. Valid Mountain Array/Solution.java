
class Solution {
    public boolean validMountainArray(int[] arr) {
        int top=-1;
        if(arr.length<=2)return false;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i])top=i;
            else if(arr[i-1]==arr[i])return false;
            else if(arr[i-1]>arr[i])break;
            else return false;
        }
        if(top==-1)return false;
        for(int j=top;j<arr.length-1;j++){
            if(arr[j]>arr[j+1])continue;
            else return false;
        }
        if(top==arr.length-1) return false;
        else return true; 
    }
}
