class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder temp=new StringBuilder();
        char arr[]=strs[0].toCharArray();
        for(int i=1;i<strs.length;i++){
            char arr_temp[]=strs[i].toCharArray();
            for(int j=0;j<arr_temp.length;j++){
                Character t1=new Character(arr[j]);
                if(arr[j]==(arr_temp[j]) && temp.contains(t1.toString())!=arr[j]){
                    temp=temp+arr[i];
                }
                if(arr[j]!=(arr_temp[j]) && temp.contains(t1.toString())==arr_temp[j]){
                    sb.append(temp);
                    sb.deleteCharAt(j);
                    temp=sb.toString(sb);

                }
            }
        }
        return temp;
    }
}
