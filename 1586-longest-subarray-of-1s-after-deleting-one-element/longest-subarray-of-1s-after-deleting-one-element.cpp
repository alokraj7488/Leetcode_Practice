class Solution {
public:
    int longestSubarray(vector<int>& nums) {
       int cnt0=0,cnt1=0;
       vector<int> helper;
       for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                cnt1++;
                if(cnt0!=0) helper.push_back(-cnt0),cnt0=0;
            }
            else{
                cnt0++;
                if(cnt1!=0) helper.push_back(cnt1),cnt1=0;
            }
       } 
       if(cnt1!=0) helper.push_back(cnt1);
       if(cnt0!=0) helper.push_back(-cnt0);
       if(helper.size()==1 && helper[0]>0) return helper[0]-1;
       int ans=0;
       for(int i=0;i<helper.size();i++){
            if(helper[i]>0) ans=max(helper[i],ans);
       }
       for(int i=1;i<helper.size()-1;i++){
        if(helper[i]==-1 && helper[i-1]>0 && helper[i+1]>0) ans=max(helper[i+1]+helper[i-1],ans);
       }
       return ans;

    }
};