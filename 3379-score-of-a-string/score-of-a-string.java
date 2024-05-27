class Solution {
    public int scoreOfString(String s) {
        char str[]=s.toCharArray();
        int n=str.length;
        int score=0;
        // int j=1;
        if(n==0)
            return 0;
        for(int i=0;i<n-1;i++){
            
                score=score+Math.abs((int)str[i]-(int)str[i+1]);
            
            
        }
        return score;
    }
}