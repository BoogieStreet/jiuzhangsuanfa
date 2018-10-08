public class Solution {
    
    public void sortIntegers(int[] A) {
       
        if(A==null||A.length==0) return;
        quickSort(A,0,A.length-1);
    }
    public void quickSort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int left=start;
        int right=end;
        int pivot=nums[(start+end)/2];//point 1
        while(left<=right){//point 2
            while(left<=right&&nums[left]<pivot){
                left++;
            }
            while(left<=right&&nums[right]>pivot){
                right--;
            }
            if(left<=right){//point 3, swap when nums[left]>=p &&nums[right]>=p to make the partition balance
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
                left++;
            }
        }
        quickSort(nums,start,right);
        quickSort(nums,left,end);
    }
}