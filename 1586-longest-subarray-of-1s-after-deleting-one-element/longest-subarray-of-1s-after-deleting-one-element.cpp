class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int l=0,ans=0;
        int cnt0=0;
        for(int r=0;r<nums.size();r++){
            if(nums[r]==0) cnt0++;
            while(cnt0>1){
                if(nums[l]==0) cnt0--;
                l++;
            }
            ans=max(ans,r-l);
        }
        return ans;
    }
};