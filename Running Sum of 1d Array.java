class Solution {
    public int[] runningSum(int[] nums) {
        int temp[] = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if(i==0){temp[i]=nums[i];}
            else{
                temp[i]=nums[i]+temp[i-1];
            }
        }
        return temp;
    }
}
