class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        String ans="";
        for(int i=0;i<n;i++){
            char str[]=words[i].toCharArray();
            int s=0;int e=str.length-1;
            while(s<=e){
                if(str[s]!=str[e])
                    break;
                else
                    s++;e--;
            }
            if(s>e || s==e){
                ans=words[i];
                return ans;
            }
        }
        return ans;
    }
}