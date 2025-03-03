// Problem link: https://leetcode.com/problems/maximum-average-subarray-i/description/
// Problem type: Medium

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
HashMap<Integer, Integer> freq = new HashMap<Integer,Integer>();

        long ans=0;

        long current_sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            current_sum+=nums[r];
            freq.put(nums[r],freq.getOrDefault(nums[r], 0) + 1);

            if(r-l+1>k){
                freq.put(nums[l],freq.getOrDefault(nums[l], 0) - 1);
                if(freq.get(nums[l])==0){
                    freq.remove(nums[l]);
                }
                current_sum-=nums[l];
                l+=1;
            }

            if(freq.size()==k && r-l+1==k){
                ans=Math.max(ans,current_sum);
            }
        }

        return ans;
    }
}
