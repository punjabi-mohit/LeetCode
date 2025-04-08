// same problem can be solved using internal string methods which is present in the below link
// https://github.com/punjabi-mohit/LeetCode/blob/main/TwoPointer/Find%20the%20Index%20of%20the%20First%20Occurrence%20in%20a%20String.java
class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int i=0;
        int right=0;
        while(i<haystack.length()){
            if(right-i+1==needle.length()){
                if(haystack.substring(i,right+1).equals(needle)){

                return i;
                }
            
                if(!haystack.substring(i,right+1).equals(needle)){
                    i++;
                }
            }
            right++;
        }
        return -1;
    }
}
