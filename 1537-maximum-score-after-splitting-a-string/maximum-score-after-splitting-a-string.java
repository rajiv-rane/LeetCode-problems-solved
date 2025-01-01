class Solution {
    public int maxScore(String s) {
        
        int MaxScore=0;

        int ptr=0;
        while(ptr<s.length()-1){
            // left substring
            int zeros=0;int ones=0;
            for(int i=0;i<=ptr;i++){
                if(s.charAt(i)=='0'){
                    zeros++;
                }
            }

            for(int i=ptr+1;i<s.length();i++){
                if(s.charAt(i)=='1')
                    ones++;
            }
            int score=zeros+ones;
            MaxScore=Math.max(score,MaxScore);

            ptr++;
        }

        return MaxScore;
    }
}