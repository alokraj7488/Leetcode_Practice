class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if(nums[j] != nums[j-1]) {
                nums[i+1] = nums[j];
                j++;
                i++;
            }
            else {
                j++;
            }
        }
        return i+1;
    }
}