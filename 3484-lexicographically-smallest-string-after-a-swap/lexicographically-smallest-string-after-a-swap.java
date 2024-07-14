class Solution {
    public String getSmallestString(String s) {
        char [] ch=s.toCharArray();
        
        for(int i=0;i<ch.length-1;i++){
            if((ch[i]-'0')>(ch[i+1]-'0') && (ch[i]-'0')%2==(ch[i+1]-'0')%2){
                // swap
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
                break; //at most 1 swap that's why
            }
        }
        return new String(ch);
    }
}