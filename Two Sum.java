import java.lang.reflect.Array;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = {0,0};
        int temp=nums[0];
        int temp_num=0;
        int flag=0;
        int count=1;
        for (int i=count;i<nums.length;i++){
            if(temp+nums[i]==target){
                int temp2=nums[i];
                Array.set(ans,0,temp_num);
                Array.set(ans,1,i);
                flag=1;
                return ans;
                }
            if(i==nums.length-1 && (temp+nums[i]!=target)){
            i=count;
            temp=nums[count];
            temp_num=count;
            count++;
            
            System.out.print(i);
            }
        }
return null;
    }
                
}