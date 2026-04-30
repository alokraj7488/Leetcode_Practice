class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int j = 2; 
        while(j < nums.length) {
            if(nums[j] != nums[k-2]) {
                nums[k] = nums[j];
                k++;
            }
            j++;
        }

        return k;
    } 
}