//烙饼排序 FlipTool.flip(array,i)可以reverse array 从0到i的数字
//每次将最大的flip到最前面，然后将整个array翻转


public void pancakeSort(int[] nums) {
       
        int end=nums.length-1;
        while(end>=0){
            for(int i=0;i<=end;i++){
                if(nums[0]<nums[i]){
                    FlipTool.flip(nums,i);
                }
            }
            FlipTool.flip(nums,end--);
            
        }
}