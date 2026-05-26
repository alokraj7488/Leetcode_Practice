class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = n-1;
        
        int[] newArr = new int[n];
        
        while(i <= j) {
            int x = nums[i] * nums[i];
            int y = nums[j] * nums[j]; 
            if(x > y) {
                newArr[k--] = x;
                i++;
            }
            else {
                newArr[k--] = y;
                j--;
            }
        }
        return newArr;
    }
}