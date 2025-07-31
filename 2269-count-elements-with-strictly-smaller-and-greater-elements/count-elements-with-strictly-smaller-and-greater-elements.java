class Solution {
    public int countElements(int[] nums) {
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]> max) max=nums[i]; 
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]< min)  min = nums[i]; 
        }
        
        int ind =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]< max && nums[i]>min){
                ind++;
            }
        }
        return ind;
    }
}