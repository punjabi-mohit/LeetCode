class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] temp=new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
            temp[i]=nums[i];
            temp[nums.length+i]=nums[i];
        }
        return temp;
    }
}
