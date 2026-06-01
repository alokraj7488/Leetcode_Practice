class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int maxDiff = Integer.MAX_VALUE;
        int finalSum = 0;
        for(int i = 0; i < n-2; i++) {
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int total = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - total);
                if(diff < maxDiff) {
                    maxDiff = diff;
                    finalSum = total;
                }
                if(total == target) {
                    return target;
                }
                else if(total < target) {
                    left++; 
                }
                else {
                    right--;
                }
            }
        }
        return finalSum;
    }
}