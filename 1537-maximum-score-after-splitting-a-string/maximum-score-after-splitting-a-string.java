class Solution {
    public int maxScore(String s) {
        // precompute the number of ones in the string
        int totalOnes=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                totalOnes++;
        }

        int zeros=0;
        int ones=totalOnes;
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')
                zeros++;
            else 
                ones--;
            score=Math.max(score,zeros+ones);
        }
        return score;
    }
}