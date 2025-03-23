class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        int index=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                String temp=word.substring(0,i+1);
                String reverse = new StringBuffer(temp).reverse().toString();
                index=i+1;
                ans=ans+reverse;
                break;
            }
        }
        ans=ans+word.substring(index,word.length());
        if(ans=="")
            return word;
        return ans;
    }
}