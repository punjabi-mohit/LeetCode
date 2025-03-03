// Problem link:https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/description/
// Problem type:Medium

class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> n = new HashSet<>();

        int l=0;
        for(int r=0;r<s.length();r++){
            if(r-l+1>k){
                l++;
            }

            if(r-l+1==k){
                n.add(s.substring(l, r+1));
            }

        }
        if(n.size()==Math.pow(2,k)){
            return true;
        }
        return false;
        
    }
}
