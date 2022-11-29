class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int temp1=0;
        int temp2=0;
        if(x<0){temp=x*-1;}
        while(temp>0){
            temp1=temp%10;
            temp2=(temp2*10)+temp1;
            temp=temp/10;
        }
        // System.out.println(temp2);
        if(x<0 && x==temp2)
        {return false;}
        else if (x!=temp2){return false;}
        else return true;
    }
}
