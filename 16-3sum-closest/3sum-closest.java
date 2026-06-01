class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - total) < Math.abs(target - closestSum)) {
                    closestSum = total;
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
        return closestSum;
    }
}