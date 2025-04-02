class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> unique=new HashSet<>();
        int left=0;
        int right=nums.length-1;
        while(left!=(nums.length/2) && right!=(nums.length/2)-1){
            unique.add((nums[left]+nums[right])/2.0);
            left++;
            right--;
        }
        return unique.size();
        
    }
}
