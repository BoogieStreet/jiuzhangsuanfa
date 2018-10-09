//time complexity :  O(n)


public class Solution {
   
    public int kthLargestElement(int n, int[] nums) {

        //k th largest means nums.length-k smallest(start from 0);
        if(nums==null||nums.length==0||n<1||n>nums.length) return -1;
        return quickSelect(nums,0,nums.length-1,nums.length-n);
    }
    public int quickSelect(int[]nums,int start,int end,int n){
        if(start>=end){
            return nums[n];
        }
        int pivot=nums[(start+end)/2];
        int left=start;
        int right=end;
        while(left<=right){
            while(left<=right&&nums[left]<pivot){
                left++;
            }
            while(left<=right&&nums[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        if(n<=right){
            return quickSelect(nums,start,right,n);
        }
        if(n>=left){
            return quickSelect(nums,left,end,n);
        }
        return nums[n];
    }
}
