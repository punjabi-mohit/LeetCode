// Problem link: https://leetcode.com/problems/maximum-average-subarray-i/description/
// Problem type: easy

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double avg=0;
        double maxavg=Double.NEGATIVE_INFINITY;
        if(nums.length==0){
            return 0;
        }
        for(int r=0;r<nums.length;r++){
            avg=avg+nums[r];
            if(r-l+1>k){
                avg=avg-nums[l];
                l++;
            }

            if(r-l+1==k){
           maxavg= Math.max(maxavg,avg);}

           
        }
         return maxavg/k;
    }
}
