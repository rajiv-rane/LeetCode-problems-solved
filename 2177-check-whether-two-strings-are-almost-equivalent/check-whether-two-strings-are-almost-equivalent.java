class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        for(char ch='a';ch<='z';ch++){
            int f1=0;int f2=0;
            for(int i=0;i<word1.length();i++){
                if(ch==word1.charAt(i))
                    f1++;
            }

            for(int i=0;i<word2.length();i++){
                if(ch==word2.charAt(i))
                    f2++;
            }
            if(Math.abs(f1-f2)>3)
                return false;
        }
        return true;
    }
}