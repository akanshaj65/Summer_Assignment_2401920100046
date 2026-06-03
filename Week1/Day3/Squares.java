public class Squares{
public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int arr[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[l])<Math.abs(nums[r])){
                arr[i]=nums[r]*nums[r];
                r--;
            }else{
                arr[i]=nums[l]*nums[l];
                l++;
            }
        }
        return arr;
    }
}