class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
    
        if(n<1) return new int[]{-1, -1};

        int s=-1;
        int e=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                hi=mid-1;
                s=mid;
            }
        }

        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
                e=mid;
            }
        }
        return new int[]{s, e};
    }
}