class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;int sum2=0;
        for(char c:s.toCharArray()){
            sum1=sum1+(int)c;
        }
        for(char c:t.toCharArray()){
            sum2=sum2+(int)c;
        }
        int value=sum2-sum1;
        return (char)value;
    }
}