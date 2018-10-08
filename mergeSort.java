//归并排序虽然是nlogn的时间复杂度，但是它需要用到额外的O(n)的空间
//这是它不优于快排的原因

public class Solution {
   
    public void sortIntegers2(int[] A) {
       
        if(A==null||A.length==0){
            return ;
        }
        int [] temp=new int[A.length];
        mergeSort(A,0,A.length-1,temp);
    }
    public void mergeSort(int []nums,int start,int end,int[] temp){
        if(start>=end) return;
        mergeSort(nums,start,(start+end)/2,temp);
        mergeSort(nums,(start+end)/2 + 1,end,temp);
        merge(nums,start,end,temp);
    }
    public void merge(int []nums,int start,int end,int[]temp){
        int mid=(start+end)/2;
        int left=start;
        int right=mid+1;
        int i=left;
        while(left<=mid&&right<=end){
            if(nums[left]<nums[right]){
                temp[i++]=nums[left++];
            }
            else{
                temp[i++]=nums[right++];
            }
        }
        while(left<=mid){
            temp[i++]=nums[left++];
        }
        while(right<=end){
            temp[i++]=nums[right++];
        }
        for(int j=start;j<=end;j++){
            nums[j]=temp[j];
        }
    }
}
